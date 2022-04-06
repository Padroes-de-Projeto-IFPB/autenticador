package br.edu.ifpb.autenticador.autenticador.service;

import br.edu.ifpb.autenticador.autenticador.domain.Address;
import br.edu.ifpb.autenticador.autenticador.domain.User;
import br.edu.ifpb.autenticador.autenticador.repository.UserRepository;
import br.edu.ifpb.autenticador.autenticador.service.exceptions.BadRequestException;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PermissionsRegistry permissionsRegistry;

    public UserService(UserRepository userRepository, PermissionsRegistry permissionsRegistry) {
        this.userRepository = userRepository;
        this.permissionsRegistry = permissionsRegistry;
    }

    public void createUser(@Valid User user) {
        userRepository.findByEmail(user.getEmail())
                .ifPresent( u -> { throw new BadRequestException("E-mail já cadastrado!"); });

        this.userRepository.save(user);
    }

    public List<User> listUsers() {
        return userRepository.findAll().stream().map(user -> {
            user.setPassword("****");
            return user;
        }).collect(Collectors.toList());
    }

    public void updateUserAddress(Long userId, @Valid Address address) {
        User user = userRepository.findById(userId).orElseThrow( () -> new BadRequestException("Usuário não existe!"));
        user.setAddress(address);
        userRepository.save(user);
    }

    public void updateUserPermission(Long userId, String permissionName) {
        User user = userRepository.findById(userId).orElseThrow( () -> new BadRequestException("Usuário não existe!"));
        user.setPermission(permissionsRegistry.get(permissionName));
        userRepository.save(user);
    }

}
