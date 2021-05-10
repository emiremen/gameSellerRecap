package business.concretes;

import adapters.CustomerCheckService;
import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class CustomerManager implements CustomerService {
//Dependency injection
    private CustomerDao customerDao;
    private CustomerCheckService customerCheckService;

    public CustomerManager(CustomerDao customerDao, CustomerCheckService customerCheckService){
        this.customerDao = customerDao;
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) throws Exception {
        if (customerCheckService.checkCustomer(customer)){
            customerDao.add(customer);
        }else {
            throw new Exception("The customer is not a valid person.");
        }

    }

    @Override
    public void update(Customer customer) {

        customerDao.update(customer);
    }

    @Override
    public void delete(Customer customer) {

        customerDao.delete(customer);
    }
}
