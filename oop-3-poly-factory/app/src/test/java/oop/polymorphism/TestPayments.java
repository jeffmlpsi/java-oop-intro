package oop.polymorphism;

import org.junit.jupiter.api.Test;

public class TestPayments {
    @Test void testCashPayment() {
        Payment payment = CreatePayment.createPayment("cash");
        payment.pay(100); // Expected output: Paid 100 using cash.
        assert payment.paymentType().equals("cash");
    }
    @Test void testCreditPayment() {
        Payment payment = CreatePayment.createPayment("credit");
        payment.pay(200); // Expected output: Paid 200 using credit card.
        assert payment.paymentType().equals("credit");
    }
    @Test void testUnknownPayment() {
        try {
            @SuppressWarnings("unused")
            Payment payment = CreatePayment.createPayment("bitcoin");
            assert false; // Should not reach here
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Unknown payment type: bitcoin"); 
        }     
    }
}
