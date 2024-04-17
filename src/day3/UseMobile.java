package day3;

public class UseMobile {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.price = Integer.parseInt(args[0]);
		mobile.brand = args[1];
		mobile.model = args[2];
		System.out.println("Price="+mobile.price+", "+"Brand="+mobile.brand+", "+"Model="+mobile.model);
	}
}
