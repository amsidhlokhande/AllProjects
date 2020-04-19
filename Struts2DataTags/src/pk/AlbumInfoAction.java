
package pk;

import com.opensymphony.xwork2.ActionSupport;

public class AlbumInfoAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String title;

	private Artist artist;

	public AlbumInfoAction()
	{
		this.title="Thriller";
		this.artist=new Artist("Amsidh Lokhande", "He is an Artist.");
		
	}
	public String execute()
	{
		return SUCCESS;
	}
	public String getTitle()
	{

		return title;
	}

	public void setTitle(String title)
	{

		this.title = title;
	}

	public Artist getArtist()
	{

		return artist;
	}

	public void setArtist(Artist artist)
	{

		this.artist = artist;
	}

}
