package com.company.classwork;
//An account should maintain a balance and have (customer) name
//        An Account should provide methods to get the current balance, make a deposit, and make a withdrawl
//        Create an account named "KYancy account" with the balance of 10
//        Create an account named "KGibbs account" with the balance of 1000
//        Withdraw 100.0 from KGibbs account
//        Deposit 100.0 to KYancy account
//        Print the balance from both accounts

public class Account {
    String name;
    Integer balance;

    public Account(String user, Integer amount)
    {
        this.name = user;
        this.balance = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    public void withdraw(Integer amount)
    {
        this.balance -= amount;
    }
    public void deposit(Integer amount)
    {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return("Member: " + this.name + " has a balance of: " + this.balance);
    }
}
