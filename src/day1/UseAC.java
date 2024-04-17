package day1;

public class UseAC {
	public static void main(String[] args) {
		AC ac = new AC();
		ac.brand = "XXX";
		ac.price = 10000;
		ac.colour = "white";
		AC ac1 = new AC();
		ac1.brand = "xxx";
		ac1.colour = "black";
		AC ac2 = new AC();
		ac2.price = 20000;
		System.out.println(ac.brand+"\n"+ac1.colour+"\n"+ac2.price);
	}
}
