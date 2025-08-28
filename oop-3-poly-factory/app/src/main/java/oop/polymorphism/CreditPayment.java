package oop.polymorphism;

// Class representing credit card payment method
public class CreditPayment extends Payment {
     CreditPayment() {
        // could also use super.paymentType = "credit";
        this.paymentType = "credit";
    }
    // Implementing the pay method for credit card payment
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card.");
    }
}
