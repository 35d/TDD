package main.java.money;

public class Dollar {
    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multipulier) {
        return new Dollar(amount * multipulier);
    }

    public boolean equals (Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
