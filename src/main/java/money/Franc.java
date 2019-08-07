package main.java.money;

public class Franc extends Money {
    private String currency;
    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int multipulier) {
        return Money.franc(amount * multipulier);
    }

    String currency() {
        return currency;
    }
}
