package dataAccess.abstracts;

import entities.concretes.Customer;
import entities.concretes.Discount;
import entities.concretes.GameProduct;
import entities.concretes.Order;

public interface OrderDao {
    void add(Order order, Customer customer, GameProduct gameProduct);
    void update(Order order, Customer customer, GameProduct gameProduct);
    void delete(Order order, Customer customer, GameProduct gameProduct);

    void add(Order order, Customer customer, GameProduct gameProduct, Discount discount);
    void update(Order order, Customer customer, GameProduct gameProduct, Discount discount);
    void delete(Order order, Customer customer, GameProduct gameProduct, Discount discount);
}
