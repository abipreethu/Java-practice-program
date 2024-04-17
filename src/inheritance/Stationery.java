package inheritance;

public class Stationery {
private String shopName;
private int noOfItems;
private String location;

public void setShopName(String shopName) {
	this.shopName=shopName;
}
public String getShopName() {
	return shopName;
}
public void setNoOfItems(int noOfItems) {
	this.noOfItems=noOfItems;
}
public int getNoOfItems() {
	return noOfItems;
}
public void setLocation(String location) {
	this.location=location;
}
public String getLocation() {
	return location;
}
public Stationery(String shopName,int noOfItems,String location) {
	this.shopName=shopName;
	this.noOfItems=noOfItems;
	this.location=location;
}
public String toString() {
	return "ShopName="+shopName+", "+"No of items="+noOfItems+", "+"Location="+location;
}

public String findWorth(int a) {
	if(a<100&&a>90) {
		return "worth";
	}
	else {
		return "worst";
	}
}
}
