package dataAbstraction;

public class AcBus extends Bus {


public void productionYear(int a, int price) {
	if(a>2017&&a<2022) {
		System.out.println(price-5000);
	}
	else if(a>2020&&a<=2022) {
		System.out.println(price-3000);
	}
	else {
		System.out.println(price);
	}
	
}
public String type(String a) {
	return a;
}

public int ticket(int distance) {
	return distance;
}


public int price(int a) {
	
	return a;
}

}

