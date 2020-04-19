
package pk;

public class Artist
{

	private String name;

	private String bioData;
    
	public Artist(String name,String bioData)
	{
		this.name=name;
		this.bioData=bioData;
	}
	
	public String getName()
	{

		return name;
	}

	public void setName(String name)
	{

		this.name = name;
	}

	public String getBioData()
	{

		return bioData;
	}

	public void setBioData(String bioData)
	{

		this.bioData = bioData;
	}

}
