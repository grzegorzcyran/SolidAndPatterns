package edu.grcy.patterns.practise.bank.interestCalculator;

public class DefaultInterestCalculator implements InterestCalculator {

    /**
     * klasy liczenia odsetek będą jednocześnie singletonami i strategią
     * singleton bo 1 instancja
     *
     * strategia bo można naprzemiennie wykorzystywać klasy liczenia odsetek
     */
    private static DefaultInterestCalculator DEFAULT_INTEREST_CALCULATOR;
    private int factor;
    private int constant;
    private int baseInterestRate;

    private DefaultInterestCalculator() {
        this.factor = 0;
        this.constant = 0;
        baseInterestRate = 1;
    }

    public static DefaultInterestCalculator getDEFAULT_INTEREST_CALCULATOR() {
        System.out.println("Wybrany " + DefaultInterestCalculator.class.getSimpleName());
        if(DEFAULT_INTEREST_CALCULATOR == null) {
            DEFAULT_INTEREST_CALCULATOR = new DefaultInterestCalculator();
        }
        return DEFAULT_INTEREST_CALCULATOR;
    }

    @Override
    public int countInterest(int capitalBalance) {
        return Math.round(capitalBalance * (baseInterestRate * factor + constant) / 100);
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getConstant() {
        return constant;
    }

    public void setConstant(int constant) {
        this.constant = constant;
    }
}
