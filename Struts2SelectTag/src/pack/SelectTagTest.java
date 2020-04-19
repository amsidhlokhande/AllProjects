package pack;

import com.opensymphony.xwork2.ActionSupport;

class City
{
  private int    id;
  private String name;

  public City(int id, String name)
  {
    this.id = id;
    this.name = name;
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public void setld(int id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}

public class SelectTagTest extends ActionSupport
{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int               city;
  private int               country;

  public City[] getCities()
  {
    City[] cities = null;
    if (country == 1)
    {
      cities = new City[3];
      cities[0] = new City(1, "Atlanta");
      cities[1] = new City(2, "Chicago");
      cities[2] = new City(3, "Detroit");
    }
    else
      if (country == 2)
      {
        cities = new City[3];
        cities[0] = new City(4, "Vancouver");
        cities[1] = new City(5, "Toronto");
        cities[2] = new City(6, "Montreal");
      }
      else
        if (country == 3)
        {
          cities = new City[2];
          cities[0] = new City(7, "Mexico City");
          cities[1] = new City(8, "Tijuana");
        }
        else
        {
          cities = new City[0];
        }
    return cities;
  }

  public int getCity()
  {
    return city;
  }

  public int getCountry()
  {
    return country;
  }

  public void setCity(int city)
  {
    this.city = city;
  }

  public void setCountry(int country)
  {
    this.country = country;
  }
}
