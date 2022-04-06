package br.edu.ifpb.autenticador.autenticador.permissoes;

public class Operador extends Padrao{

    public Operador(){
        permission.setListPermission(true);
        permission.setInsertPermission(true);
        permission.setUpdatePermission(true);
    }

    public Operador(Operador operador){

    }

    @Override
    public Padrao clone() {

        return new Operador(this);
    }
}
