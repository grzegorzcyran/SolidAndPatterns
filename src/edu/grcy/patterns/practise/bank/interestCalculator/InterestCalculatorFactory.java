package edu.grcy.patterns.practise.bank.interestCalculator;

public class InterestCalculatorFactory {
    /**
     *
     * klasa fabryczna
     *
     * która wybiera algorym naliczania odsetek
     * algorytmy to osobne strategie
     *
     * które dodatkowo są singletonami
     */

    public static InterestCalculator getInterestCalculator(int capital) {
        if (capital > 500000) {
            return VipInterestCalculator.getVIP_INTEREST_CALCULATOR();
        }
        return DefaultInterestCalculator.getDEFAULT_INTEREST_CALCULATOR();
    }
}
