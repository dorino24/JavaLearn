package pojo;

import java.math.BigDecimal;

public abstract class TradeAccount {
    private String id;

    public TradeAccount(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract TradeAccount clone();

    public abstract void add(BigDecimal amount);

    protected abstract void substract(BigDecimal amount);

}