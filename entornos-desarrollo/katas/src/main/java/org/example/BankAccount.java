package org.example;

public class BankAccount {
    int id;
    String name;
    double balance;

    public boolean deposit(double number) {
        if (number <= 0) return false;
        balance += number;
        return true;
    }

    public boolean withdraw(double number) {
        if (number <= 0 || number > getBalance()) {
            return false;
        } else {
            balance -= number;
            return true;
        }
    }

    public BankAccount(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
