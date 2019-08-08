package edu.mum.cs.cs425.fubc.fubcbankingapp.repository;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.AccountType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountTypeRepository extends PagingAndSortingRepository<AccountType, Integer> {
}
