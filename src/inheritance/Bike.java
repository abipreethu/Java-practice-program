package inheritance;

public class Bike {
String brand;
int price;
float rating;

public String findNetPrice(int price,int percentage) {
	return "Net Price="+((price*percentage/100)+price);
	
}
}
