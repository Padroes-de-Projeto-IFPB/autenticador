package br.edu.ifpb.autenticador.autenticador.web.builder;

import br.edu.ifpb.autenticador.autenticador.domain.City;
import br.edu.ifpb.autenticador.autenticador.domain.Country;
import br.edu.ifpb.autenticador.autenticador.domain.State;

public interface Builder {
    public Builder setStreet(String rua);
    public Builder setNeighborhood(String bairro);
    public Builder setNumber(String numero);
    public Builder setCity(String cidade);
    public Builder setState(String estado);
    public Builder setCountry(String pais);
}
