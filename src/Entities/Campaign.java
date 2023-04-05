package Entities;

public class Campaign {
	
	private int campaignno;
	private int campaignamount;
	
	public Campaign() {}
	
	
	
	public Campaign(int campaignno, int campaignamount) {
		
		this.campaignno = campaignno;
		this.campaignamount = campaignamount;
	}



	public int getCampaignno() {
		return campaignno;
	}



	public void setCampaignno(int campaignno) {
		this.campaignno = campaignno;
	}



	public int getCampaignamount() {
		return campaignamount;
	}



	public void setCampaignamount(int campaignamount) {
		this.campaignamount = campaignamount;
	}
	
	
	
	

}
