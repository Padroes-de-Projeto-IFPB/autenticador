package br.edu.ifpb.autenticador.autenticador.web.builder;

import br.edu.ifpb.autenticador.autenticador.domain.Address;
import br.edu.ifpb.autenticador.autenticador.domain.City;
import br.edu.ifpb.autenticador.autenticador.domain.Country;
import br.edu.ifpb.autenticador.autenticador.domain.State;


public class AddressBuilder implements Builder {
    private String street;
    private String neighborhood;
    private String number;
    private String city;
    private String state;
    private String country;

    @Override
    public AddressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    @Override
    public AddressBuilder setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    @Override
    public AddressBuilder setNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public AddressBuilder setState(String state) {
        this.state = state;
        return this;
    }

    @Override
    public AddressBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address getResult() {
        return new Address(this.street, this.neighborhood, this.number,
                new City(this.city, new State(this.state, new Country(this.country))));
    }
}
