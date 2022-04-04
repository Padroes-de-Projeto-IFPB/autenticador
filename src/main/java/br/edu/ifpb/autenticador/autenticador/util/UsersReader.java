package br.edu.ifpb.autenticador.autenticador.util;

import br.edu.ifpb.autenticador.autenticador.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

// TODO - Transformar essa classe em um SINGLETON para guardar lista de usuários do arquivo, ao invés de carregar do arquivo em cada chamada
public class UsersReader {

    private static volatile UsersReader instance;
    private static User[] users;

    private static final String JSON_FILE = "users.json";


    private UsersReader() {}


    public static UsersReader getInstance()throws URISyntaxException, IOException{
        UsersReader result = instance;
        if (result != null) {
            return result;
        }
        synchronized(UsersReader.class) {
            if (instance == null) {
                instance = new UsersReader();
            }

            loadUsersListFromJson();
            return instance;
        }
    }

    public static void loadUsersListFromJson() throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        users = objectMapper.readValue(new File(ClassLoader.getSystemResource(JSON_FILE).toURI()), User[].class);
    }

    public static List<User> getUsersFromList() throws URISyntaxException, IOException {
        return asList(users);
    }

}
