package br.edu.ifpb.autenticador.autenticador.registry;

import br.edu.ifpb.autenticador.autenticador.permissoes.Padrao;

import java.util.HashMap;
import java.util.Map;

public class PermissionCache {

    private Map<String, Padrao> cache = new HashMap<>();

    public Padrao put(String key, Padrao padrao) {
        cache.put(key, padrao);
        return padrao;
    }

    public Padrao get(String key) {
        return cache.get(key).clone();
    }

}
