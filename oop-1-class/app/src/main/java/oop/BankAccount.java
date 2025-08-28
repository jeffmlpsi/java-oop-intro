package oop;

public class BankAccount {
private double balance = 0.0;  
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds or invalid amount");
        }
    }
    
    public double getBalance() {
        return balance;
    } 
}
