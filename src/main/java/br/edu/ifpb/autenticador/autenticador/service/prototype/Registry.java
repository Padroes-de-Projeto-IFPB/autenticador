package br.edu.ifpb.autenticador.autenticador.service.prototype;

import br.edu.ifpb.autenticador.autenticador.domain.Permissions;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Registry {
    private Map<String, Permissions> prototypes = new HashMap<>();

    public Registry() {
        // ADMIN
        Permissions Admin = new Permissions();
        Admin.setAdminPermission(true);
        this.add("Administrador", Admin);

        // SOMENTELEITURA
        Permissions Read = new Permissions();
        Read.setAdminPermission(false);
        Read.setListPermission(true);
        Read.setDeletePermission(false);
        Read.setInsertPermission(false);
        Read.setUpdatePermission(false);
        this.add("SomenteLeitura", Read);

        // OPERADOR
        Permissions Operator = new Permissions();
        Operator.setAdminPermission(false);
        Operator.setDeletePermission(false);
        Operator.setListPermission(true);
        Operator.setInsertPermission(true);
        Operator.setUpdatePermission(true);
        this.add("Operador", Operator);

        // DEFAULT
        Permissions Default = new Permissions();
        Default.setAdminPermission(false);
        Default.setDeletePermission(false);
        Default.setListPermission(false);
        Default.setInsertPermission(false);
        Default.setUpdatePermission(false);
        this.add("Default", Default);
    }

    public void add(String key, Permissions permissions) {
        this.prototypes.put(key.toUpperCase(), permissions);
    }

    public Permissions get(String key) {
        if (this.prototypes.get(key.toUpperCase()) == null) {
            return this.prototypes.get("DEFAULT").clone();
        }

        return this.prototypes.get(key.toUpperCase()).clone();
    }
}
