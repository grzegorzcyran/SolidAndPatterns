package edu.grcy.patterns.practise.bank.testingAccounts;

import edu.grcy.patterns.practise.bank.account.Account;
import edu.grcy.patterns.practise.bank.account.AccountFactory;
import edu.grcy.patterns.practise.bank.client.Client;
import edu.grcy.patterns.practise.bank.endOfMonth.EndOfMonth;
import edu.grcy.patterns.practise.bank.endOfMonth.EndOfMonthClientSummary;
import edu.grcy.patterns.practise.bank.endOfMonth.EndOfMonthInterestCapitalisation;
import edu.grcy.patterns.practise.bank.interestCalculator.InterestCalculatorInit;

import java.util.List;

public class TestingAccounts {
    public static void main(String[] args) {
        InterestCalculatorInit init = new InterestCalculatorInit();
        init.interestCalculatorInit();
        grubaKrecha();
        Account account1 = AccountFactory.getAccount("c", "Konto 1");
        System.out.println(account1.getAccountName());

        depositAndShow(account1, 500);
        depositAndShow(account1, 550000);
        withdrawAndShow(account1, 100000);

        grubaKrecha();
        Account account2 = AccountFactory.getAccount("c", "Konto 2");
        System.out.println(account2.getAccountName());
        depositAndShow(account2, 2000);
        depositAndShow(account2, 5000);

        EndOfMonth endOfMonthProcess1 = new EndOfMonthInterestCapitalisation(List.of(account1, account2));
        endOfMonthProcess1.performOperation();
        grubaKrecha();
        List.of(account1, account2)
                .stream()
                .forEach(x -> System.out.println(x.getAccountName() + "; balance= " +
                        x.getBalance() + "; interest= "+
                        x.getInterestCalculated() + ";"));
        Client client1 = new Client("Marek", "Biernat");
        Client client2 = new Client("Olgierd", "Łuksik");
        client1.addAccount(account1);
        client1.addAccount(account2);
        Account account3 = AccountFactory.getAccount("c", "Konto 3");
        Account account4 = AccountFactory.getAccount("s", "Konto 4");
        client2.addAccount(account3);
        client2.addAccount(account4);
        grubaKrecha();
        depositAndShow(account3, 25000);
        depositAndShow(account4, 200);
        grubaKrecha();

        new EndOfMonthClientSummary(List.of(client1, client2)).performOperation();

    }

    private static void grubaKrecha() {
        System.out.println("===========================");
        System.out.println("===========================");
    }

    private static void withdrawAndShow(Account account, int amount) {
        int currentInterest;
        grubaKrecha();
        account.withdraw(amount);
        currentInterest = account.calculateInterest();
        System.out.println(account.getAccountInfo());
        System.out.println("Bieżące odsetki dla konta: " + currentInterest);
    }

    private static void depositAndShow(Account account, int amount) {
        int currentInterest;
        grubaKrecha();
        account.deposit(amount);
        currentInterest = account.calculateInterest();
        System.out.println(account.getAccountInfo());
        System.out.println("Bieżące odsetki dla konta: " + currentInterest);
    }
}
