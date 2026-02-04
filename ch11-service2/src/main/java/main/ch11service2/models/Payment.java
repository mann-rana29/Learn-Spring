package main.ch11service2.models;

public class Payment {
    private String id;
    private double amount;

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
