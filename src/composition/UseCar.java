package composition;

public class UseCar {
public static void main(String[] args) {
	Engine e = new Engine();
	e.brand = "Ford";
	e.price = 10000;
	e.cc = 120;
	
	Car c = new Car();
	c.brand = "Ford";
	c.price = 5000000;
	c.color = "Black";
	c.engine = e;
	
	System.out.println(c.brand+" "+c.engine.cc);
	
}
}
