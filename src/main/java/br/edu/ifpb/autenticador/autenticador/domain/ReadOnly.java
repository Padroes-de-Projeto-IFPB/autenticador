package br.edu.ifpb.autenticador.autenticador.domain;

public class ReadOnly extends Permissions{

    public ReadOnly() {
    }

    public ReadOnly(ReadOnly target) {
        super(target);
        if (target != null){
            this.setListPermission(true);
        }
    }

    @Override
    public Permissions clone() {
        return new ReadOnly(this);
    }
}

