package day3;

public class UseLaptop {
public static void main(String[] args) {
	Laptop laptop = new Laptop();
	laptop.brand = "Samsong";
	laptop.price = 10000;
	laptop.color = "black";
	laptop.isWarranty = true;
	
	System.out.println((laptop.brand).toUpperCase()+","+(laptop.brand).length()+","+(laptop.brand).startsWith("S")+","+(laptop.brand).charAt((laptop.brand).length()-1)+","+(laptop.color).toLowerCase());
	
			
			
			
			
}
}
