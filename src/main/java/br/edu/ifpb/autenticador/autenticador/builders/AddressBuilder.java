package br.edu.ifpb.autenticador.autenticador.builders;

import br.edu.ifpb.autenticador.autenticador.domain.Address;
import br.edu.ifpb.autenticador.autenticador.domain.City;
import br.edu.ifpb.autenticador.autenticador.domain.Country;
import br.edu.ifpb.autenticador.autenticador.domain.State;

public class AddressBuilder implements Builder{

    private String rua;
    private String numero;
    private String bairro;
    private Address address;

    private String pais;
    private Country countryClass;

    private String estado;
    private Country country;
    private State stateClass;

    private String cidade;
    private State state;
    private City city;


    @Override
    public AddressBuilder setStreet(String rua) {
        this.rua = rua;
        return this;
    }

    @Override
    public AddressBuilder setNumber(String numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public AddressBuilder setNeighborhood(String bairro) {
        this.bairro = bairro;
        return this;
    }

    @Override
    public AddressBuilder setName(String pais) {
        this.pais = pais;
        return this;
    }

    @Override
    public AddressBuilder setNameEstado(String estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public AddressBuilder setCountry(Country country) {
        this.country = country;
        return this;
    }

    @Override
    public AddressBuilder setNameCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    @Override
    public AddressBuilder setState(State state) {
        this.state = state;
        return this;
    }

    @Override
    public AddressBuilder setCity(City city) {
        this.city = city;
        return this;
    }

    public Address getResultAddress() {

        this.address = new Address();
        address.setStreet(rua.toString());
        address.setNumber(numero.toString());
        address.setNeighborhood(bairro.toString());

        return address;
    }

    public Country getResultCountry() {

        this.countryClass = new Country();
        country.setName(pais.toString());
        return this.countryClass;
    }


    public State getResultState() {
        this.stateClass = new State();
        stateClass.setName(estado.toString());
        stateClass.setCountry(countryClass);
        return this.stateClass;
    }

    public City getResultCity() {
        city = new City();
        city.setName(cidade.toString());
        city.setState(this.stateClass);
        this.address.setCity(city);
        return city;
    }
}
