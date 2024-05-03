package org.howard.edu.lsp.oopfinal.question2;

public class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(double pay) {
        System.out.println("Paid " + pay + " using Bitcoin address " + bitcoinAddress);
    }
}

