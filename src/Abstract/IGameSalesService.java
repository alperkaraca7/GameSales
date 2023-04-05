package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface IGameSalesService {
	
	
	public void add(Game game);
	public void buying(Customer customer,Game game);
	public void buying(Customer customer,Game game,Campaign campaign);

}
