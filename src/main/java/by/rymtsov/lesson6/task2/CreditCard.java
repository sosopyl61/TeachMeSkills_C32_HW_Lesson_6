package main.java.by.rymtsov.lesson6.task2;

/**
 * This is the class that which describes a credit card.
 * I override toString method to output the information about the card.
 */

public class CreditCard {
    String cardNumber;
    double balance;

    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Credit card number: " +
                cardNumber + '\n' +
                "Balance: " + balance +
                '\n';
    }
}
