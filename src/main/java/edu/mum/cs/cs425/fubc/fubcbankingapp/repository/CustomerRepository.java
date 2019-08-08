package edu.mum.cs.cs425.fubc.fubcbankingapp.repository;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
