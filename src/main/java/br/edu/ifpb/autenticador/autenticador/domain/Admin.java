package br.edu.ifpb.autenticador.autenticador.domain;

public class Admin extends Permissions{

    public Admin() {
    }

    public Admin(Admin target) {
        super(target);
        if (target != null){
            this.setAdminPermission(true);
        }
    }

    @Override
    public Permissions clone() {
        return new Admin(this);
    }
}


