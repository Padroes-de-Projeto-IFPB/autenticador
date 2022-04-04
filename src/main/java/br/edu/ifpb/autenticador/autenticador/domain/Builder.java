package br.edu.ifpb.autenticador.autenticador.domain;

public class Builder {

    private String street;
    private String neighborhood;
    private String number;

    private String cityName;

    private String stateName;

    private String countryName;


    public Builder setStreet(String street) {
        this.street = street;
        return this;
    }

    public Builder setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public Builder setNumber(String number) {
        this.number = number;
        return this;
    }

    public Builder setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public Builder setStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }


    public Builder setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public Address getResult() {
        return new Address(street,neighborhood,number,new City(cityName, new State(stateName, new Country(countryName))));
    }

}
