package wtp;

public class Converter {
	public float celsiusToFarenheit ( float celsius )
	  {
		System.out.println("celsiusToFarenheit method");
	    return (celsius * 9 / 5) + 32;
	  }

	  public float farenheitToCelsius ( float farenheit )
	  {
		  System.out.println("farenheitToCelsius method");
	    return (farenheit - 32) * 5 / 9;
	  }
}
