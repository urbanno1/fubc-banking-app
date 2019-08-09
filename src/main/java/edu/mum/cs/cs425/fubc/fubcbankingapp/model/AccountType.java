package edu.mum.cs.cs425.fubc.fubcbankingapp.model;

import javax.persistence.*;

@Entity()
@Table(name = "accounttypes")
public class AccountType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
