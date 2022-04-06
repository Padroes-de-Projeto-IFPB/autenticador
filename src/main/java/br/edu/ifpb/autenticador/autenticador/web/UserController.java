package br.edu.ifpb.autenticador.autenticador.web;

import br.edu.ifpb.autenticador.autenticador.builder.AddressBuilder;
import br.edu.ifpb.autenticador.autenticador.domain.*;
import br.edu.ifpb.autenticador.autenticador.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final AddressBuilder addressBuilder;

    @GetMapping
    public List<User> listUsers() {
        return userService.listUsers();
    }

    @PutMapping("/update-address")
    public ResponseEntity<Void> updateAddress(Long userId, String rua, String numero, String bairro, String cidade, String estado, String pais) {
        addressBuilder.setStreet(rua)
                .setNumber(numero)
                .setNeighborhood(bairro)
                .setCity(cidade)
                .setState(estado)
                .setCountry(pais);

        userService.updateUserAddress(userId, addressBuilder.getResult());

        return ResponseEntity.ok().build();
    }

    @PutMapping("update-permissions")
    public ResponseEntity<Void> updatePermissions(Long userId, String permissionName) {
        userService.updateUserPermission(userId, permissionName);
        return ResponseEntity.ok().build();
    }


}
