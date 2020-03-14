package spring.beer.brewery.web.service;

import spring.beer.brewery.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
