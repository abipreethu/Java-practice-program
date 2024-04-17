package Encapsulation;

public class TV {
private String brand;
private int price;
private Remote remote;

public void setBrand(String brand) {
	this.brand=brand;
}
public void setPrice(int price) {
	this.price=price;
}
public void setRemote(Remote rem) {
	remote=rem;
}

public String toString() {
	return "Brand="+brand+","+"Price="+price+","+remote;
}
}
