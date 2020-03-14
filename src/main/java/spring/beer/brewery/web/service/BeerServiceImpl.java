package spring.beer.brewery.web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.beer.brewery.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id((UUID.randomUUID()))
                .beerName("Tuborg")
                .beerStyle("Strong")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Bira")
                .beerStyle("Miild")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
