package Encapsulation;

public class AC {
String brand;
String model;
String color;
int price;
int warrentyYear;
Compressor compressor;

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
public void setColor(String color) {
	this.color = color;
}
public String getColor() {
	return color;
}
public void setPrice(int price) {
	this.price = price;
}
public int getPrice() {
	return price;
}
public void setWarrentyYear(int warrentyYear) {
	this.warrentyYear = warrentyYear;
}
public int getWarentyYear() {
	return warrentyYear;
}
public void setCompressor(Compressor comp) {
	compressor = comp;
}
public Compressor getCompressor() {
	return compressor;
}

}
