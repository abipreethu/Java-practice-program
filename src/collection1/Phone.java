package collection1;

public class Phone {
private String brand;
private int price;
private String colour;
private float rating;
private boolean isGood;
private int batteryCapacity;

public void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public void setColour(String colour) {
	this.colour=colour;
}
public String getColor() {
	return colour;
}
public void setRating(float rating) {
	this.rating=rating;
}
public float getRating() {
	return rating;
}
public void setIsGood(boolean isGood) {
	this.isGood=isGood;
}
public boolean getIsGood() {
	return isGood;
}
public void setBatteryCapacity(int batteryCapacity) {
	this.batteryCapacity=batteryCapacity;
}
public int getBatteryCapacity() {
	return batteryCapacity;
}
public Phone(String brand,int price,String colour,float rating,boolean isGood,int batteryCapacity) {
	this.brand=brand;
	this.price=price;
	this.colour=colour;
	this.rating=rating;
	this.isGood=isGood;
	this.batteryCapacity=batteryCapacity;
}
public String toString() {
	return "Brand="+brand+", "+"Price="+price+", "+"Colour="+colour+", "+"Rating="+rating+", "+"Is Good"+isGood+", "+"Battery Capacity="+batteryCapacity;
}
}
