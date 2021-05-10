package adapters;

import entities.concretes.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public interface CustomerCheckService {
    boolean checkCustomer(Customer customer) throws ServiceException, RemoteException;
}
