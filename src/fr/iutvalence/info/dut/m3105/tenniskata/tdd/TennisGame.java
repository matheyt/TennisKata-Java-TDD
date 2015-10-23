package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public final static String A_MARQUE1="a_marqué_1";
	private String scoreServer;
	
	public String getResult() {
		if (scoreServer==A_MARQUE1)
			return "fifteen_love";
		return "love_all";
	}

	public void setScoreServer(String score) {
		this.scoreServer = score;
		
	}

}
