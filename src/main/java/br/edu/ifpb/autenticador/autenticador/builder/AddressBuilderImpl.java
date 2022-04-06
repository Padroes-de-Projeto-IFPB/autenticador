package br.edu.ifpb.autenticador.autenticador.builder;

import br.edu.ifpb.autenticador.autenticador.domain.Address;
import br.edu.ifpb.autenticador.autenticador.domain.City;
import br.edu.ifpb.autenticador.autenticador.domain.Country;
import br.edu.ifpb.autenticador.autenticador.domain.State;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class AddressBuilderImpl implements AddressBuilder {

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

    @Override
    public Address getResult() {
        return new Address(null, this.getStreet(), this.getNeighborhood(), this.getNumber(), new City(null, this.getCity(), new State(null, this.getState(), new Country(null, this.getCountry()))));
    }
}
