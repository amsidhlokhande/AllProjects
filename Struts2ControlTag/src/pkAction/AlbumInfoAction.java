
package pkAction;

import java.util.ArrayList;

import pkbean.Artist;
import pkbean.Song;

public class AlbumInfoAction
{
      
	private String title;

	private Artist artist;

	private ArrayList<Artist> artistList = new ArrayList<Artist>();

	private static ArrayList<Song> songList = new ArrayList<Song>();
    static 
    {
		songList.add(new Song("Thriller", "Disco"));
		songList.add(new Song("Beat It", "Rock"));
		songList.add(new Song("Billie Jean", "Pop"));
	}
    
	public String populate()
	{
	    this.title="Thriller";
	    this.artist=new Artist("Amsidh Lokhande", "He is an Artist.");
		artistList.add(artist);
		
		return "populate";
	}
	public String execute()
	{
		return "success";
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

	public ArrayList<Artist> getArtistList()
	{

		return artistList;
	}

	public void setArtistList(ArrayList<Artist> artistList)
	{

		this.artistList = artistList;
	}

	public ArrayList<Song> getSongList()
	{

		return songList;
	}

	public void setSongList(ArrayList<Song> songList)
	{

		this.songList = songList;
	}

}
