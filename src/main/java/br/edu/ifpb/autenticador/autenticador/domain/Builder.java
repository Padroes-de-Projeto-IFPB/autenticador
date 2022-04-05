package br.edu.ifpb.autenticador.autenticador.domain;

public interface Builder {
    Builder setStreet(String street);
    Builder setNeighborhood(String neighborhood);
    Builder setNumber(String number);
    Builder setCity(String pais, String estado, String cidade);
    Address getResult();
}
