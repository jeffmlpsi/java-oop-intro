package oop.polymorphism;

// Abstract class representing a payment method
public abstract class Payment {
    protected String paymentType = "";
    abstract void pay(int amount);
    public String paymentType() {
        return paymentType;
    }
}
