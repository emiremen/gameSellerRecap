package dataAccess.concretes.oracle;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class OracleCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Customer added: " + customer.getName() + " " + customer.getSurname());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer updated: " + customer.getName() + " " + customer.getSurname());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer deleted: " + customer.getName() + " " + customer.getSurname());
    }
}
