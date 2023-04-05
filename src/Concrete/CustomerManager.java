package Concrete;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager{
	
	MernisServiceAdapter _mernisadapter;
	
	

	public CustomerManager(MernisServiceAdapter _mernisadapter) {
		
		this._mernisadapter = _mernisadapter;
	}

	@Override
	public void Save(Customer customer) {
		
		if (_mernisadapter.checkIfRealCustomer(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Geçersiz kişi");
		}
		
		
	}
	
	@Override
	public void Delete(Customer customer) {
		
		System.out.println("Müşteri silindi :"+customer.getFirstname());
		super.Delete(customer);
	}
	
	@Override
	public void Update(Customer customer) {
		
		
		System.out.println("Müşteri Güncellendi :"+customer.getFirstname());
		super.Update(customer);
	}
}
