package entities.concretes;

import entities.abstracts.Entity;

public class Discount implements Entity {
    int id;
    int gameProductId;
    boolean isValid;
    int discountRate;

    public Discount() {
    }

    public Discount(int id, int gameProductId, boolean isValid, int discountRate) {
        this.id = id;
        this.gameProductId = gameProductId;
        this.isValid = isValid;
        this.discountRate = discountRate;
    }

    public Discount(int id, int gameProductId, boolean isValid) {
        this.id = id;
        this.gameProductId = gameProductId;
        this.isValid = isValid;
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

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
