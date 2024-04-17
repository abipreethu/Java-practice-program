package dataAbstraction;

public class Car implements Vehicle,RoadRules {
	public int price(int a) {
		return a;
	}
public void productionYear(int a,int price) {
	if(a>2017&&a<2020) {
		System.out.println(price-5000);
	}
	else if(a>2020&&a<=2022) {
		System.out.println(price-3000);
	}
	else {
		System.out.println(price);
	}
}
public int speedlimit(String a) {
	if(a.equalsIgnoreCase("city")) {
		return 40;
	}
	else {
		return 80;
	}
}


}
