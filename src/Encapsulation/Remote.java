package Encapsulation;

public class Remote {
private int price;
private String brand;

public void setPrice(int price) {
	this.price=price;
}
public void setBrand(String brand) {
	this.brand=brand;
}

public String toString() {
	return "Brand="+brand+","+"Price="+price; 
}
}
