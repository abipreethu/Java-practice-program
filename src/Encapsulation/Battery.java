package Encapsulation;

public class Battery {
private	String brand;
private	int capacity;
private	int price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	public Battery (int cap) {
		capacity = cap;
	}
	
	public String toString() {
		return "Capacity ="+capacity;
	}
}
