package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			try {
				return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityid()), customer.getFirstname(), customer.getLastname(), customer.getYearofbirth());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		} catch (RemoteException exception) {
			
			exception.printStackTrace();
		}
		return true;
		
		
	}

}
