package com.nt.jj;

public class Sample
{
private String name;
private String addres;
private String Location;
public String getName() {
	
	
	
	return name;
}
public Sample(String name, String addres, String location) {
	super();
	this.name = name;
	this.addres = addres;
	Location = location;
}
public void setName(String name) {
	this.name = name;
}
public String getAddres() {
	return addres;
}
public void setAddres(String addres) {
	this.addres = addres;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}

}
