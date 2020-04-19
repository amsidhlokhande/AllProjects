/**
 *
 */
package com.sourceallies.portlets.spring.controller;
 
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
 
import javax.inject.Inject;
import javax.inject.Named;
 
import com.sourceallies.portlets.spring.bean.WeatherReturn;
import com.sourceallies.service.WeatherServiceClient;
 
/**
 * @author lsah
 *
 */
@Named("viewController")
public class WeatherViewController implements Serializable {
 
 /**
 *
 */
 private static final long serialVersionUID = 8811407513884269900L;
 
 private static final Logger LOGGER = Logger.getLogger(WeatherViewController.class.getName());
 
 private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a z");
 
 @Inject
 @Named("weatherServiceClient")
 private WeatherServiceClient weatherServiceClient;
 
 private WeatherReturn weatherReturn;
 
 private String zipCode = "50312";
 
 private String currentTime = DATE_FORMAT.format(new Date());
 
 /**
 * @return the currentTime
 */
 public String getCurrentTime() {
 return currentTime;
 }
 
 /**
 * @param currentTime
 *            the currentTime to set
 */
 public void setCurrentTime(String currentTime) {
 this.currentTime = currentTime;
 }
 
 public WeatherViewController() {
 }
 
 public String updateWeather() {
 LOGGER.info("Zip Code: " + zipCode);
 weatherReturn = weatherServiceClient.getWeatherByZipCode(zipCode);
 return null;
 }
 
 public void updateTime() {
 // LOGGER.info("------------------>>>>>>Updating time...");
 this.currentTime = DATE_FORMAT.format(new Date());
 }
 
 /**
 * @return the weatherServiceClient
 */
 public WeatherServiceClient getWeatherServiceClient() {
 return weatherServiceClient;
 }
 
 /**
 * @param weatherServiceClient
 *            the weatherServiceClient to set
 */
 public void setWeatherServiceClient(WeatherServiceClient weatherServiceClient) {
 this.weatherServiceClient = weatherServiceClient;
 }
 
 /**
 * @return the weatherReturn
 */
 public WeatherReturn getWeatherReturn() {
 if (this.weatherReturn == null) {
 weatherReturn = weatherServiceClient.getWeatherByZipCode("50312");
 LOGGER.info("Temperature (Spring Portlet MVC): " + weatherReturn.getTemperature());
 }
 return weatherReturn;
 }
 
 /**
 * @param weatherReturn
 *            the weatherReturn to set
 */
 public void setWeatherReturn(WeatherReturn weatherReturn) {
 this.weatherReturn = weatherReturn;
 }
 
 /**
 * @return the zipCode
 */
 public String getZipCode() {
 return zipCode;
 }
 
 /**
 * @param zipCode
 *            the zipCode to set
 */
 public void setZipCode(String zipCode) {
 this.zipCode = zipCode;
 }
}