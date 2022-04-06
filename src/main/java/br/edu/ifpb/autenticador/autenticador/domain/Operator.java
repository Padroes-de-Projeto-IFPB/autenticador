package br.edu.ifpb.autenticador.autenticador.domain;

public class Operator extends Permissions{

    public Operator() {
    }

    public Operator(Operator target) {
        super(target);
        if (target != null){
            this.setListPermission(true);
            this.setInsertPermission(true);
            this.setUpdatePermission(true);
        }
    }

    @Override
    public Permissions clone() {
        return new Operator(this);
    }
}

