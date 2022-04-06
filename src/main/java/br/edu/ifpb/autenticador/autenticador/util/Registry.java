package br.edu.ifpb.autenticador.autenticador.util;

import br.edu.ifpb.autenticador.autenticador.domain.*;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Permissions> cache = new HashMap<>();

    public Registry() {
        Admin admin = new Admin();
        ReadOnly readOnly = new ReadOnly();
        Operator operator = new Operator();
        Default def = new Default();

        cache.put("Admin", admin);
        cache.put("readOnly", readOnly);
        cache.put("operator", operator);
        cache.put("default", def);
    }

    public Permissions put(String key, Permissions permissions){
        cache.put(key, permissions);
        return permissions;
    }

    public Permissions get(String key){
        return cache.get(key).clone();
    }
}

