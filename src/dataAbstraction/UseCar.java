package dataAbstraction;

public class UseCar {
public static void main(String[] args) {
	Car c = new Car();
	System.out.println(c.price(1000));
	c.productionYear(2021, 10000);
	System.out.println("city");
}
}
