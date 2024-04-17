package Encapsulation;

public class Mobile {
private int price;
private String brand;
private String model;
private Battery battery;

public void setPrice(int price) {
	this.price = price;
}
public int getPrice() {
	return price;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getBrand() {
	return brand;
}
public void setModel(String model) {
	this.model = model;
}
public String getModel() {
	return model;
}
public void setBattery(Battery bat) {
	battery = bat;
}
public Battery getBattery() {
	return battery;
}

public Mobile(String brand,int price,Battery bat) {
	this.brand = brand;
	this.price = price;
	this.battery = bat;
}
	public String toString() {
		return "Brand="+brand+",Price="+price+" "+battery; 
	}

}
