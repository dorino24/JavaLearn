package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount {

    private BigDecimal cashBalance;

    public CashAccount(String id, BigDecimal cashBalance) {
        super(id);
        this.cashBalance = cashBalance;
    }

    public BigDecimal getCashBalance() {
        return this.cashBalance;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    @Override
    public TradeAccount clone() {
        return new CashAccount(this.getId(), this.cashBalance);
    }

    @Override
    public void add(BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    protected void substract(BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'substract'");
    }

}
