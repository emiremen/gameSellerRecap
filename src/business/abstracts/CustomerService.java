package business.abstracts;

import entities.concretes.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public interface CustomerService {
    void add(Customer customer) throws Exception;
    void update(Customer customer);
    void delete(Customer customer);
}
