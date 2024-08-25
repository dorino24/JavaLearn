package service;

import java.math.BigDecimal;
import pojo.Credit;
import repository.AccountRepository;

public class CreditService implements AccountService {

    AccountRepository repository;

    @Override
    public void deposit(String id, BigDecimal amount) {
        Credit credit = retrieveAccount(id);
        credit.setCredit(credit.getCredit().subtract(amount));
        updateAccount(credit);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Credit credit = retrieveAccount(id);
        credit.setCredit(credit.getCredit().add(amount));
        updateAccount(credit);
    }

    public CreditService(AccountRepository repository) {
        this.repository = repository;
    }

    public void createAccount(Credit credit) {
        this.repository.createAccount(credit);
    }

    public Credit retrieveAccount(String id) {
        return (Credit) this.repository.retrieveAccount(id);
    }

    public void updateAccount(Credit credit) {
        this.repository.updateAccount(credit);
    }

    public void deleteAccount(String id) {
        this.repository.deleteAccount(id);
    }

}
