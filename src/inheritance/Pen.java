package inheritance;

public class Pen extends Stationery  {
private String brand;
private String color;
private int price;

public void setbrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setColor(String color) {
	this.color=color;
}
public String getColor() {
	return color;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}

public Pen(String shopName,int noOfItems,String location,String brand,String color,int price) {
	super(shopName,noOfItems,location);
	this.brand=brand;
	this.color=color;
	this.price=price;
}
public String toString() {
	return super.getShopName()+", "+"Brand="+brand+", "+"Color="+color+", "+"Price="+price;
}

public String findIsColor(String a) {
	if(a.equals("blue")) {
		return "Yes";
	}
	else {
		return "No";
	}
}
}
