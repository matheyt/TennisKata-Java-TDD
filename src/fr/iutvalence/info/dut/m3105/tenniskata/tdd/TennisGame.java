package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public final static String A_MARQUE1="a_marqué_1";
	private String scoreServer;
	private String scoreReceiver;
	
	public String getResult() {
		if (this.scoreServer==A_MARQUE1)
			return "fifteen_love";
		if (this.scoreReceiver==A_MARQUE1)
			return "love_fifteen";
		return "love_all";
	}

	public void setScoreServer(String score) {
		this.scoreServer = score;
	}

	public void setScoreReceiver(String score) {
		this.scoreReceiver = score;
	}

}
