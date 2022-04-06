package br.edu.ifpb.autenticador.autenticador.permissoes;

import br.edu.ifpb.autenticador.autenticador.domain.Permissions;

import java.util.Objects;

public abstract class Padrao {

    public Permissions permission;

    public Padrao() {
        this.permission = new Permissions();
        permission.setAdminPermission(false);
        permission.setDeletePermission(false);
        permission.setListPermission(false);
        permission.setInsertPermission(false);
        permission.setUpdatePermission(false);
    }

    public abstract Padrao clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Padrao)) return false;
        Padrao padrao2 = (Padrao) object2;
        return Objects.equals(padrao2.permission, permission);
    }
}
