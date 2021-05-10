package adapters;

import Mernis.KPSPublicLocator;
import entities.concretes.Customer;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService{
    @Override
    public boolean checkCustomer(Customer customer) throws ServiceException, RemoteException {
        KPSPublicLocator client = new KPSPublicLocator();
        return client.getKPSPublicSoap().TCKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                customer.getName(),
                customer.getSurname(),
                customer.getYearOfBirth()
                );
    }
}
