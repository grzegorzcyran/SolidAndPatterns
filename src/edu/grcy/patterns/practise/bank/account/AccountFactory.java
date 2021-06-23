package edu.grcy.patterns.practise.bank.account;

public class AccountFactory {

    public static Account getAccount(String shortcut, String name) {
        //na razie nasza fabryka zwraca zawsze taki sam typ konta,
        //ale jeszcze to porozdzielamy
        if (AccountType.getByShortcut(shortcut) != null) {
            return new Account(name, shortcut);
        }
        return null;
    }
}
