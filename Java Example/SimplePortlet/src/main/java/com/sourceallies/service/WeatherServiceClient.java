/**
*
*/
package com.sourceallies.service;
 
import java.util.logging.Logger;
 
import javax.inject.Named;
 
import com.sourceallies.portlets.spring.bean.WeatherReturn;
 
/**
* @author lsah
*
*/
@Named(value = "weatherServiceClient")
public class WeatherServiceClient {
 
private static final Logger LOGGER = Logger.getLogger(WeatherServiceClient.class.getName());
 
public WeatherServiceClient() {
}
 
/**
* @param zipCode
* @return the weather for the given zip code.
*/
public WeatherReturn getWeatherByZipCode(String zipCode) {
LOGGER.info("Zip Code: " + zipCode);
 
// Invoke Web Service / DAO layer to get the real-time data and return
 
return new WeatherReturn().withZipCode(zipCode).withCity("Des Moines").withState("IA").withTemperature("37").withDescription("Light Rain");
}
}