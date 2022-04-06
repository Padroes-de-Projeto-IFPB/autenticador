package br.edu.ifpb.autenticador.autenticador.builder;

import br.edu.ifpb.autenticador.autenticador.domain.Address;

public interface AddressBuilder {
    AddressBuilder setStreet(String street);
    AddressBuilder setNeighborhood(String neighborhood);
    AddressBuilder setNumber(String number);
    AddressBuilder setCity(String city);
    AddressBuilder setState(String state);
    AddressBuilder setCountry(String country);
    Address getResult();
}
