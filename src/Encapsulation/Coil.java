package Encapsulation;

public class Coil {
private String brand;
private int price;

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

public Coil (String brand,int price) {
	this.brand = brand;
	this.price=price;
}

public String toString() {
	return "Brand="+brand+", Price="+price;
}
}
