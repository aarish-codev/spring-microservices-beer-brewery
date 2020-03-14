package spring.beer.brewery.web.service;

import org.springframework.stereotype.Service;
import spring.beer.brewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return new CustomerDto().builder()
                .id(UUID.randomUUID())
                .name("New Customer")
                .build();
    }
}
