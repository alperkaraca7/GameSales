package Concrete;

import Abstract.BaseGameSalesManager;
import Abstract.ICustomerCheckService;
import Abstract.IGameSalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameSalesManager extends BaseGameSalesManager{
	
	public GameSalesManager(ICustomerCheckService checkservice) {
		super(checkservice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Game game) {
		
		
		
		super.add(game);
	}
	
	@Override
	public void buying(Customer customer, Game game) {
		
		
		
		super.buying(customer, game);
	}
	
	@Override
	public void buying(Customer customer, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		super.buying(customer, game, campaign);
	}
	
	


}
