package edu.mum.cs.cs425.fubc.fubcbankingapp.model;

public class AccountType {

    private Integer accountTypeId;
    private String accountTypeName;

    public AccountType() {
    }

    public AccountType(Integer accountTypeId, String accountTypeName) {
        this.accountTypeId = accountTypeId;
        this.accountTypeName = accountTypeName;
    }

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }
}
