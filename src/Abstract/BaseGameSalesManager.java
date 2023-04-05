package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public abstract class BaseGameSalesManager implements IGameSalesService{
	
	ICustomerCheckService checkservice ;
	
	
	
	public BaseGameSalesManager(ICustomerCheckService checkservice) {
		this.checkservice = checkservice;
	}

	@Override
	public void add(Game game) {
		
		
		
		System.out.println(game.getGamename()+" isimli oyun sisteme eklendi");
		
	}
	
	@Override
	public void buying(Customer customer, Game game) {
		
		System.out.println(customer.getFirstname()+" isimli oyuncu "+ game.getGamename()+" adlı oyunu"+game.getGameprice()+" Tl'ye satın aldı");
		
	}
	
	@Override
	public void buying(Customer customer, Game game, Campaign campaign) {
		
		
		if (checkservice.checkIfRealCustomer(customer)) {
			System.out.println(customer.getFirstname()+" isimli oyuncu "+game.getGameprice()+"TL'lik "+ game.getGamename()+" adlı oyunu yüzde "+campaign.getCampaignamount()+" Tl indirimle satın aldı");
		}
		else {
			System.out.println("Geçersiz kişi , Oyun satın alma işlemi gerçekleştirilmedi");
		}
		
		
		
	}

}
