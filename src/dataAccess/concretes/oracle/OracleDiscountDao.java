package dataAccess.concretes.oracle;

import dataAccess.abstracts.DiscountDao;
import entities.concretes.Discount;

public class OracleDiscountDao implements DiscountDao {
    @Override
    public void add(Discount discount) {
        System.out.println("Discount added for this game: " + discount.getGameProductId());
    }

    @Override
    public void update(Discount discount) {
        System.out.println("Discount updated for this game: " + discount.getGameProductId());
    }

    @Override
    public void delete(Discount discount) {
        System.out.println("Discount deleted for this game: " + discount.getGameProductId());
    }
}
