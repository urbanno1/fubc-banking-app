package edu.mum.cs.cs425.fubc.fubcbankingapp.repository;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
}
