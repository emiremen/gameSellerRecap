package business.concretes;

import business.abstracts.OrderService;
import dataAccess.abstracts.OrderDao;
import entities.concretes.Customer;
import entities.concretes.Discount;
import entities.concretes.GameProduct;
import entities.concretes.Order;

public class OrderManager implements OrderService {

    private OrderDao orderDao;

    public OrderManager(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void add(Order order, Customer customer, GameProduct gameProduct) {
        orderDao.add(order, customer, gameProduct);
    }

    @Override
    public void update(Order order, Customer customer, GameProduct gameProduct) {
        orderDao.add(order, customer, gameProduct);
    }

    @Override
    public void delete(Order order, Customer customer, GameProduct gameProduct) {
        orderDao.add(order, customer, gameProduct);
    }

    @Override
    public void add(Order order, Customer customer, GameProduct gameProduct, Discount discount) {

        order.setTotalPayment(
                gameProduct.getPrice() - (gameProduct.getPrice() / 100) * discount.getDiscountRate()
        );
        orderDao.add(order, customer, gameProduct, discount);
    }

    @Override
    public void update(Order order, Customer customer, GameProduct gameProduct, Discount discount) {
        orderDao.update(order, customer, gameProduct, discount);
    }

    @Override
    public void delete(Order order, Customer customer, GameProduct gameProduct, Discount discount) {
        orderDao.delete(order, customer, gameProduct, discount);
    }
}
