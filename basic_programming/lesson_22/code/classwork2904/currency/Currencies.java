package classwork2904.currency;

public enum Currencies {
    EURO(1),
    USD(1.06),
    TL(34.42);

    private final double coefficient;

    Currencies(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
    public static double exchange(Currencies initialCurrency, double amount, Currencies targetCurrency) {
        amount /= initialCurrency.coefficient;
        amount *= targetCurrency.coefficient;

        return amount;
    }
}
