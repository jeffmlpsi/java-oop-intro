package oop.polymorphism;

// Factory class to create Payment objects based on type
public final class CreatePayment {
    public static Payment createPayment(String type) {
        Payment payment;
        if (type.equalsIgnoreCase("cash")) {
            payment = new CashPayment();
        } else if (type.equalsIgnoreCase("credit")) {
            payment = new CreditPayment();
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + type);
        }
        return payment;
    }
    
}
