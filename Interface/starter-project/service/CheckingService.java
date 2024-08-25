package service;

import java.math.BigDecimal;
import pojo.Checking;
import repository.AccountRepository;


public class CheckingService implements AccountService {
    
    AccountRepository repository;

    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking checking = retrieveAccount(id);
        checking.setBalance(checking.getBalance().add(amount));
        updateAccount(checking);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking checking = retrieveAccount(id);
        checking.setBalance(checking.getBalance().subtract(amount));
        updateAccount(checking);
    }

    public CheckingService(AccountRepository repository) {
        this.repository = repository;
    }

    public void createAccount(Checking checking) {
        this.repository.createAccount(checking);
    }

    public Checking retrieveAccount(String id) {
        return (Checking) this.repository.retrieveAccount(id);
    }

    public void updateAccount(Checking checking) {
        this.repository.updateAccount(checking);
    }

    public void deleteAccount(String id) {
        this.repository.deleteAccount(id);
    }


}
