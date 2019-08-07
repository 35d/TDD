package main.java.money;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = "USD";
    }
    public Money times(int multipulier) {
        return Money.dollar(amount * multipulier);
    }

    String currency() {
        return currency;
    }
}
