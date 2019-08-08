package edu.mum.cs.cs425.fubc.fubcbankingapp.model;

public class Account {
    private Long accountId;
    private Long accountNumber;
    private Float balance;

    public Account() {
    }

    public Account(Long accountId, Long accountNumber, Float balance) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
