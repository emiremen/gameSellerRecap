package entities.concretes;

import entities.abstracts.Entity;

public class Order implements Entity {
    int id;
    int gameProductId;
    int customerId;
    double totalPayment;

    public Order() {
    }

    public Order(int id, int gameProductId, int customerId) {
        this.id = id;
        this.gameProductId = gameProductId;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGameProductId() {
        return gameProductId;
    }

    public void setGameProductId(int gameProductId) {
        this.gameProductId = gameProductId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
