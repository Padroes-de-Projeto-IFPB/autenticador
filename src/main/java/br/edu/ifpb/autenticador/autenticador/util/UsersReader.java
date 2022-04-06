package br.edu.ifpb.autenticador.autenticador.util;

import br.edu.ifpb.autenticador.autenticador.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static java.util.Arrays.asList;

@Slf4j
public class UsersReader {

    private static final String JSON_FILE = "users.json";

    private static UsersReader instance;

    @Getter
    private final List<User> loadedUsers;

    private UsersReader() throws URISyntaxException, IOException {
        log.info("Criando instância singleton da classe UsersReader");
        this.loadedUsers = loadUsersFromJson();
    }

    private List<User> loadUsersFromJson() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User[] users = objectMapper.readValue(new File(ClassLoader.getSystemResource(JSON_FILE).toURI()), User[].class);
        return asList(users);
    }

    public static UsersReader getInstance() throws URISyntaxException, IOException {
        if (instance != null) {
            return instance;
        }
        synchronized (UsersReader.class) {
            if (instance == null) {
                instance = new UsersReader();
            }
            return instance;
        }
    }


}
