package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	private int scoreServer;
	
	public String getResult() {
		if (scoreServer==15)
			return "fifteen_love";
		return "love_all";
	}

	public void setScoreServer(int score) {
		this.scoreServer = score;
		
	}

}
