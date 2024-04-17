package day2;

public class Gayu {
public static void main(String [] args) {
	String x = "welcome";
	boolean y = x.contains("o");
	System.out.println(y);
	boolean z = x.startsWith("w");
	System.out.println(z);
	boolean w = x.endsWith("r");
	System.out.println(w);
	String a = "abi";
	String b = "ABI";
	boolean c = a.equalsIgnoreCase(b);
	System.out.println(c);
	
}
}
