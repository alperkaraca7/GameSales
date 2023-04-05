package Abstract;

import Entities.Customer;

public interface ICustomerService {
	
	public void Save(Customer customer);
	
	public void Delete(Customer customer);
	
	public void Update(Customer customer);
	

}
