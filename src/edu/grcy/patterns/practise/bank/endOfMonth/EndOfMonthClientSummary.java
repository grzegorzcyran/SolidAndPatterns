package edu.grcy.patterns.practise.bank.endOfMonth;

import edu.grcy.patterns.practise.bank.client.Client;

import java.util.List;

public class EndOfMonthClientSummary implements EndOfMonth {
    private List<Client> clients;

    public EndOfMonthClientSummary(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void performOperation() {
        clients.stream()
                .forEach(x -> System.out.println(x.getClientInfo()));
    }
}
