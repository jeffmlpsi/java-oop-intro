package oop.polymorphism;

// Class representing cash payment method
public class CashPayment extends Payment {
    CashPayment() {
        // could also use this.paymentType = "cash";
        super.paymentType = "cash";
    }
    // Implementing the pay method for cash payment
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using cash.");
    }
    
}
