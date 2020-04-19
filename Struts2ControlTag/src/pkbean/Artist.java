
package pkbean;

public class Artist
{

	private String artistName;

	private String artistBioData;

	public Artist(String artistName, String artistBioData)
	{

		this.artistName = artistName;
		this.artistBioData = artistBioData;
	}

	public String getArtistName()
	{

		return artistName;
	}

	public void setArtistName(String artistName)
	{

		this.artistName = artistName;
	}

	public String getArtistBioData()
	{

		return artistBioData;
	}

	public void setArtistBioData(String artistBioData)
	{

		this.artistBioData = artistBioData;
	}
     
}
