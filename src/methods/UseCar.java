package methods;

public class UseCar {
public static void main(String[] args) {
	Car c1 = new Car();
	c1.brand = "aaaa";
	c1.price = 50000;
	c1.colour = "white";
	c1.taxPercentage = 5;
	c1.netPrice = c1.findNetPrice(c1.price,c1.taxPercentage);
	
	Car c2 = new Car();
	c2.brand = "bbbb";
	c2.price = 60000;
	c2.colour = "black";
	c2.taxPercentage = 7;
	c2.netPrice = c2.findNetPrice(c2.price,c2.taxPercentage);
	
	Car c3 = new Car();
	c3.brand = "cccc";
	c3.price = 70000;
	c3.colour = "red";
	c3.taxPercentage = 3;
	c3.netPrice = c3.findNetPrice(c3.price,c3.taxPercentage);
	
	
	Car c4 = new Car();
	c4.brand = "dddd";
	c4.price = 80000;
	c4.colour = "white";
	c4.taxPercentage = 2;
	c4.netPrice = c4.findNetPrice(c4.price,c4.taxPercentage);
	
	
	Car c5 = new Car();
	c5.brand = "aaaa";
	c5.price = 50000;
	c5.colour = "white";
	c5.taxPercentage = 5;
	c5.netPrice = c5.findNetPrice(c5.price,c5.taxPercentage);
	
//	c1.Display();
//	c2.Display();
//	c3.Display();
//	c4.Display();
//	c5.Display();
	
	Car[] cars = {c1,c2,c3,c4,c5};
	Car newCar = c1.maxPrice(cars);
	System.out.println(newCar.brand+" "+newCar.price+" "+newCar.colour+" "+newCar.taxPercentage+" "+newCar.netPrice);
	
	
}
}
