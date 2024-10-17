package main.java.by.rymtsov.lesson6.task2;

import static main.java.by.rymtsov.lesson6.task2.TransferService.addMoney;
import static main.java.by.rymtsov.lesson6.task2.TransferService.withdrawMoney;

/**
 * This is the main class for classes CreditCard and TransferService.
 * Here we have three cards and some operations with them.
 */

public class MainCard {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("1111111111111111", 50.0);
        CreditCard creditCard2 = new CreditCard("4444444444444444", 25.0);
        CreditCard creditCard3 = new CreditCard("3333333333333333", 100.0);

        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);

        addMoney(25, creditCard1);
        addMoney(100, creditCard2);
        withdrawMoney(50, creditCard3);

        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);
    }
}
