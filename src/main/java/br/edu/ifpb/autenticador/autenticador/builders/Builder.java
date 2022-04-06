package br.edu.ifpb.autenticador.autenticador.builders;

import br.edu.ifpb.autenticador.autenticador.domain.Address;
import br.edu.ifpb.autenticador.autenticador.domain.City;
import br.edu.ifpb.autenticador.autenticador.domain.Country;
import br.edu.ifpb.autenticador.autenticador.domain.State;

public interface Builder {

    Builder setStreet(String rua);
    Builder setNumber(String numero);
    Builder setNeighborhood(String bairro);

    Builder setName(String pais);

    Builder setNameEstado(String estado);
    Builder setCountry(Country country);

    Builder setNameCidade(String cidade);
    Builder setState(State state);
    Builder setCity(City city);

}
