package day1;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "BMW";
		car1.price = 15000;
		car1.colour = "white";
		car1.taxPercentage = 10;
		car1.netPrice = (car1.price * car1.taxPercentage / 100) + car1.price;
		System.out.println(car1.netPrice);
		Car car2 = new Car();
		car2.brand = "xxx";
		car2.price = 20000;
		car2.colour = "black";
		car2.taxPercentage = 10;
		car2.discountPercentage =  car2.price-(car2.price * car2.taxPercentage / 100);
		System.out.println(car2.discountPercentage);
	}

}
