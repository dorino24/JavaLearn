package service;

import java.math.BigDecimal;
import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {
    
    private TradeAccountRepository tradeAccountRepository;
    
    public CashAccountService(TradeAccountRepository tradeAccountRepository){
        this.tradeAccountRepository = tradeAccountRepository;
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount cashAccount = retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().add(amount));
        updateTradeAccount(cashAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount cashAccount = retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().subtract(amount));
        updateTradeAccount(cashAccount);
    }

    public void createTradeAccount(CashAccount cashAccount){
        this.tradeAccountRepository.createTradeAccount(cashAccount);
    }
    public CashAccount retrieveTradeAccount(String id){
        return (CashAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
    }
    public void updateTradeAccount(CashAccount cashAccount){
        this.tradeAccountRepository.updateTradeAccount(cashAccount);
    }
    public void deleteTradeAccount(String id){
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

}
