package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	
	@Override
	public void Save(Customer customer) {
		
		System.out.println("Sisteme kayıt edildi : "+customer.getFirstname());
	}
	
	@Override
	public void Delete(Customer customer) {
		
		
	}
	
	@Override
	public void Update(Customer customer) {
		 
		
	}

}
