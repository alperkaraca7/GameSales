import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseGameSalesManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameSalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {
	
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer("25216183064", "Ramazan", "Karaca",1950));
		
		
		
		BaseCampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(new Campaign(01, 50));
		
		
		BaseGameSalesManager basegameSalesManager = new GameSalesManager(new MernisServiceAdapter());
		
		basegameSalesManager.buying(new Customer("14110554124","Alper", "Karaca", 2003), new Game(01, "GTA-5", 500), new Campaign(01, 50));
	}

}
