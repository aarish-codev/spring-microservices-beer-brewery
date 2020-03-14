package spring.beer.brewery.web.service;

import spring.beer.brewery.web.model.CustomerDto;

import java.util.UUID;


public interface CustomerService {

    public CustomerDto getCustomerById(UUID customerId);
}
