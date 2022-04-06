package br.edu.ifpb.autenticador.autenticador.permissoes;

public class SomenteLeitura extends Padrao{

    public SomenteLeitura(){
        permission.setListPermission(true);
    }

    public SomenteLeitura(SomenteLeitura somenteLeitura){

    }

    @Override
    public Padrao clone() {

        return new SomenteLeitura(this);
    }
}
