package main.java.by.rymtsov.lesson6.task2;

/**
 * This is the class which describes operations with cards.
 * You can both add and withdraw money from the card.
 */

public class TransferService {

    public static void addMoney(double money, CreditCard card) {
        if (money <= 0)
            System.out.println("Invalid amount!");
        else
            card.balance += money;
    }

    public static void withdrawMoney(double money, CreditCard card) {
        if (money <= 0)
            System.out.println("Invalid amount!");
        else if (money > card.balance)
            System.out.println("Insufficient balance!");
        else
            card.balance -= money;
    }
}
