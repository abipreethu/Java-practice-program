package methods;

public class Car {
String brand;
int price;
String colour;
int taxPercentage;
int netPrice;

public int findNetPrice(int price, int taxPercentage) {
	return (price*taxPercentage/100)+price;
}
public void Display() {
	System.out.println(brand+" "+price+" "+colour+" "+netPrice);
}

public Car maxPrice(Car[] a) {
	Car max = a[0];
	for(int i=0;i<a.length;i++) {
	if(a[i].price>max.price) {
		max=a[i];
	}
	}
	return max;
}
}
