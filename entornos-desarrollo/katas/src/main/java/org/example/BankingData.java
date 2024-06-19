package org.example;

public class BankingData {
    private int num;
    private String name;
    private double balance;

    public BankingData() {
    }

    public boolean deposit(double number) {
        if (number <= 0) return false;
        else  {
            balance += number;
            return true;
        }
    }

    public boolean withdraw(double number) {
        if (number <= 0)
            return false;
        else {
            balance -= number;
            return true;
        }
    }

    public BankingData(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public BankingData(int num, String name, double balance) {
        this.num = num;
        this.name = name;
        this.balance = balance;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }


}
