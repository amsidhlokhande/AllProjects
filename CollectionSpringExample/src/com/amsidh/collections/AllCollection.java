/**
 * 
 */
package com.amsidh.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author VIRU
 * 
 */
public class AllCollection {
	private List listOfShape;
	private Set setOfShape;
	private Map mapOfShape;
	private Properties propOfShape;

	
	public List getListOfShape() {
		return listOfShape;
	}

	public void setListOfShape(List listOfShape) {
		this.listOfShape = listOfShape;
	}

	public Set getSetOfShape() {
		return setOfShape;
	}

	public void setSetOfShape(Set setOfShape) {
		this.setOfShape = setOfShape;
	}

	public Map getMapOfShape() {
		return mapOfShape;
	}

	public void setMapOfShape(Map mapOfShape) {
		this.mapOfShape = mapOfShape;
	}

	public Properties getPropOfShape() {
		return propOfShape;
	}

	public void setPropOfShape(Properties propOfShape) {
		this.propOfShape = propOfShape;
	}

	public String toString()  
	 {  
	return "List Elements :"  + listOfShape+"\nSet Elements :"  + setOfShape+"\n" +  
	 "Map Elements :"  + mapOfShape+"\nProperty Elements :"  + propOfShape;  
	    
	 } 
}
