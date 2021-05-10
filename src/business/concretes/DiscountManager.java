package business.concretes;

import business.abstracts.DiscountService;
import dataAccess.abstracts.DiscountDao;
import entities.concretes.Discount;

public class DiscountManager implements DiscountService {

    private DiscountDao discountDao;

    public DiscountManager(DiscountDao discountDao) {
        this.discountDao = discountDao;
    }

    @Override
    public void add(Discount discount) {
        discountDao.add(discount);
    }

    @Override
    public void update(Discount discount) {
        discountDao.update(discount);
    }

    @Override
    public void delete(Discount discount) {
        discountDao.delete(discount);
    }
}
