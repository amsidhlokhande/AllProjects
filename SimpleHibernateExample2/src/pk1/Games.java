package pk1;

import java.io.Serializable;

public class Games implements Serializable
{
	private String gameName;
	private String numberOfPlayers;
	private String numberOfLevels;

	public Games()
	{
	}

	public String getGameName()
	{
		return gameName;
	}

	public void setGameName(String gameName)
	{
		this.gameName = gameName;
	}

	public String getNumberOfPlayers()
	{
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(String numberOfPlayers)
	{
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getNumberOfLevels()
	{
		return numberOfLevels;
	}

	public void setNumberOfLevels(String numberOfLevels)
	{
		this.numberOfLevels = numberOfLevels;
	}

}
