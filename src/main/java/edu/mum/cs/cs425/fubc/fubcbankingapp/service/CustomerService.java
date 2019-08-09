package edu.mum.cs.cs425.fubc.fubcbankingapp.service;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    public abstract Page<Customer> getCustomersList(int pageNo);
    public abstract Customer saveCustomer(Customer customer);
}
