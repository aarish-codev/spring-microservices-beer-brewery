package spring.beer.brewery.web.service;

import spring.beer.brewery.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {

    public BeerDto getBeerById(UUID beerId);
}
