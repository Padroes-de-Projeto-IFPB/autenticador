package br.edu.ifpb.autenticador.autenticador.permissoes;

public class PermisaoDefault extends Padrao{

    public PermisaoDefault() {

    }

    public PermisaoDefault(PermisaoDefault permisaoDefault){

    }

    @Override
    public Padrao clone() {
        return new PermisaoDefault(this);
    }
}
