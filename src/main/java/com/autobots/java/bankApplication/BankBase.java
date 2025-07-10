package com.autobots.java.bankApplication;

public abstract class  BankBase implements Bank {

    private long accountNumber;
    private long routingNumber;

    public  BankBase(long accountNumber , long routingNumber){


        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }
}
