package edu.mum.cs.cs425.fubc.fubcbankingapp.service.impl;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.AccountType;
import edu.mum.cs.cs425.fubc.fubcbankingapp.repository.AccountTypeRepository;
import edu.mum.cs.cs425.fubc.fubcbankingapp.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AccountTypeServiceImpl implements AccountTypeService {

    @Autowired
    private AccountTypeRepository repository;

    @Override
    public Page<AccountType> getAccountTypeList(int pageNo) {
        return repository.findAll(PageRequest.of(pageNo, 3, Sort.by("accountTypeName")));
    }

    @Override
    public AccountType saveAccountType(AccountType accountType) {
        return repository.save(accountType);
    }
}
