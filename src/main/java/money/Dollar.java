package main.java.money;

public class Dollar {
    int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multipulier) {
        return new Dollar(amount * multipulier);
    }
}
