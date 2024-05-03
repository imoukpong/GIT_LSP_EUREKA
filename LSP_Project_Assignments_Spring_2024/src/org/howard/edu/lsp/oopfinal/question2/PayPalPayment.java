package org.howard.edu.lsp.oopfinal.question2;

public class PayPalPayment implements PaymentStrategy {
    private String emailAddress;

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double pay) {
        System.out.println("Paid " + pay + " using PayPal account " + emailAddress);
    }
}

