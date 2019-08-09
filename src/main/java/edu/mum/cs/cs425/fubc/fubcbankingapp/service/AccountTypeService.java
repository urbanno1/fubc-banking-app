package edu.mum.cs.cs425.fubc.fubcbankingapp.service;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.AccountType;
import org.springframework.data.domain.Page;

public interface AccountTypeService {
    public abstract Page<AccountType> getAccountTypeList(int pageNo);
    public AccountType saveAccountType(AccountType accountType);
}
