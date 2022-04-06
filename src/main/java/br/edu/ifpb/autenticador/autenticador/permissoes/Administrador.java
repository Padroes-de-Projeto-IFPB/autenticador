package br.edu.ifpb.autenticador.autenticador.permissoes;

public class Administrador extends Padrao{

    public Administrador(){
        permission.setAdminPermission(true);
    }

    public Administrador (Administrador administrador){

    }

    @Override
    public Padrao clone() {
        return new Administrador(this);
    }
}
