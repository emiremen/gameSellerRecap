package business.abstracts;

import entities.concretes.Discount;

public interface DiscountService {
    void add(Discount discount);
    void update(Discount discount);
    void delete(Discount discount);
}
