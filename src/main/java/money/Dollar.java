package main.java.money;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multipulier) {
        return new Dollar(amount * multipulier);
    }
}
