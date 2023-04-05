package Abstract;

import Entities.Campaign;
import Entities.Customer;

public abstract class BaseCampaignManager implements ICampaignService{
	
	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Yeni kampanya eklendi yüzde "+campaign.getCampaignamount());
		
	}
	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("kampanya silindi yüzde "+campaign.getCampaignamount());
		
	}
	
	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya Güncellendi yüzde "+campaign.getCampaignamount());
		
	}

}
