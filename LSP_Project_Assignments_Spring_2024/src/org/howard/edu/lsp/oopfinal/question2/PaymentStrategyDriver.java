package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Create payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Checkout with different payment methods
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50.0);

        cart.setPaymentStrategy(bitcoinPayment);
        cart.checkout(75.0);
    }
}

