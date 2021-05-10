package dataAccess.abstracts;

import entities.concretes.Discount;
import entities.concretes.GameProduct;

public interface DiscountDao {
    void add(Discount discount);
    void update(Discount discount);
    void delete(Discount discount);
}
