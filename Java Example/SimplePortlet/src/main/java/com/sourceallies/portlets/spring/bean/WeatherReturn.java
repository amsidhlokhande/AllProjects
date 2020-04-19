/**
* Weather.java
* Feb 28, 2012
*/
package com.sourceallies.portlets.spring.bean;
 
import java.io.Serializable;
 
/**
* @author Lal
*
*/
public class WeatherReturn implements Serializable {
 
/**
*
*/
private static final long serialVersionUID = 2221936547464343855L;
 
private String zipCode;
 
private String temperature;
 
private String city;
 
private String state;
 
private String description;
 
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
 
/**
* @return the temperature
*/
public String getTemperature() {
return temperature;
}
 
/**
* @param temperature
*            the temperature to set
*/
public void setTemperature(String temperature) {
this.temperature = temperature;
}
 
/**
* @return the city
*/
public String getCity() {
return city;
}
 
/**
* @param city
*            the city to set
*/
public void setCity(String city) {
this.city = city;
}
 
/**
* @return the state
*/
public String getState() {
return state;
}
 
/**
* @param state
*            the state to set
*/
public void setState(String state) {
this.state = state;
}
 
/**
* @return the description
*/
public String getDescription() {
return description;
}
 
/**
* @param description
*            the description to set
*/
public void setDescription(String description) {
this.description = description;
}
 
/**
* @param zipCode
* @return
*/
public WeatherReturn withZipCode(String zipCode) {
this.zipCode = zipCode;
return this;
}
 
/**
* @param temperature
* @return
*/
public WeatherReturn withTemperature(String temperature) {
this.temperature = temperature;
return this;
}
 
/**
* @param city
* @return
*/
public WeatherReturn withCity(String city) {
this.city = city;
return this;
}
 
/**
* @param state
* @return
*/
public WeatherReturn withState(String state) {
this.state = state;
return this;
}
 
/**
* @param description
* @return
*/
public WeatherReturn withDescription(String description) {
this.description = description;
return this;
}
}