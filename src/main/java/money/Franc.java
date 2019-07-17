package main.java.money;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }
    public Franc times(int multipulier) {
        return new Franc(amount * multipulier);
    }
}
