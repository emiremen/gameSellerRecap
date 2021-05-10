package dataAccess.concretes.oracle;

import dataAccess.abstracts.OrderDao;
import entities.concretes.Customer;
import entities.concretes.Discount;
import entities.concretes.GameProduct;
import entities.concretes.Order;

public class OracleOrderDao implements OrderDao {
    @Override
    public void add(Order order, Customer customer, GameProduct gameProduct) {
        System.out.println(gameProduct.getName() + " Order added to cart: " + gameProduct.getPrice() + " for: " + customer.getName());
    }

    @Override
    public void update(Order order, Customer customer, GameProduct gameProduct) {
        System.out.println(gameProduct.getName() + " Order updated: " + gameProduct.getPrice() + " for: " + customer.getName());
    }

    @Override
    public void delete(Order order, Customer customer, GameProduct gameProduct) {
        System.out.println(gameProduct.getName() + " Order deleted: " + gameProduct.getPrice() + " from: " + customer.getName());
    }

    @Override
    public void add(Order order, Customer customer, GameProduct gameProduct, Discount discount) {
        System.out.println(gameProduct.getName() + " Order added to cart: " + gameProduct.getPrice() + " for: " + customer.getName() + " total: ₺" + order.getTotalPayment());
    }

    @Override
    public void update(Order order, Customer customer, GameProduct gameProduct, Discount discount) {
        System.out.println(gameProduct.getName() + " Order updated: " + gameProduct.getPrice() + " for: " + customer.getName() + " total: ₺" + order.getTotalPayment());
    }

    @Override
    public void delete(Order order, Customer customer, GameProduct gameProduct, Discount discount) {
        System.out.println(gameProduct.getName() + " Order deleted: " + gameProduct.getPrice() + " from: " + customer.getName() + " total: ₺" + order.getTotalPayment());
    }
}
