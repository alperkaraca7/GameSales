package Entities;

public class Game {
	
	private int gameid;
	private String gamename;
	private double gameprice;
	
	public Game() {}

	public Game(int gameid, String gamename, double gameprice) {
		this.gameid = gameid;
		this.gamename = gamename;
		this.gameprice = gameprice;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public double getGameprice() {
		return gameprice;
	}

	public void setGameprice(double gameprice) {
		this.gameprice = gameprice;
	}
	
	
	
	

}
