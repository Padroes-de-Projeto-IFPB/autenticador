package br.edu.ifpb.autenticador.autenticador.domain;

public class Default extends Permissions{

    public Default() {
    }

    public Default(Default target) {
        super(target);
        if(target != null) {
            this.setAdminPermission(false);
            this.setListPermission(false);
            this.setUpdatePermission(false);
            this.setInsertPermission(false);
            this.setDeletePermission(false);
        }
    }



    @Override
    public Permissions clone() {
        return new Default(this);
    }
}

