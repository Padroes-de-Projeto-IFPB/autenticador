package br.edu.ifpb.autenticador.autenticador.service;

import br.edu.ifpb.autenticador.autenticador.domain.Permissions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class PermissionsRegistry {

    private Map<String, Permissions> cache = new HashMap<>();

    @PostConstruct
    public void initPermissions() {
        Permissions administrador = new Permissions();
        administrador.setAdminPermission(true);

        Permissions somenteLeitura = new Permissions();
        somenteLeitura.setAdminPermission(false);
        somenteLeitura.setListPermission(true);
        somenteLeitura.setDeletePermission(false);
        somenteLeitura.setInsertPermission(false);
        somenteLeitura.setUpdatePermission(false);

        Permissions operador = new Permissions();
        operador.setAdminPermission(false);
        operador.setDeletePermission(false);
        operador.setListPermission(true);
        operador.setInsertPermission(true);
        operador.setUpdatePermission(true);

        Permissions padrao = new Permissions();
        padrao.setAdminPermission(false);
        padrao.setDeletePermission(false);
        padrao.setListPermission(false);
        padrao.setInsertPermission(false);
        padrao.setUpdatePermission(false);

        cache.put("administrador", administrador);
        cache.put("somenteLeitura", somenteLeitura);
        cache.put("operador", operador);
        cache.put("padrao", padrao);
    }

    public Permissions put(String key, Permissions permission) {
        cache.put(key, permission);
        return permission;
    }

    public Permissions get(String key) {
        if (!cache.containsKey(key)){
            key = "padrao";
        }

        return cache.get(key).clone();
    }

}
