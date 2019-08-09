package edu.mum.cs.cs425.fubc.fubcbankingapp.service.impl;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.Customer;
import edu.mum.cs.cs425.fubc.fubcbankingapp.repository.CustomerRepository;
import edu.mum.cs.cs425.fubc.fubcbankingapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public Page<Customer> getCustomersList(int pageNo) {
        return repository.findAll(PageRequest.of(pageNo, 3, Sort.by("lastName")));
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }
}
