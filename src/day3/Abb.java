package day3;

public class Abb {
public static void main (String [] args) {
	String a = args[0];
	String b = args[1];
	System.out.println(a.concat(b));
	int c = Integer.parseInt(args[2]);
	int d = Integer.parseInt(args[3]);
	System.out.println(c+d);
	
	float e = Float.parseFloat(args[4]);
	System.out.println(e);
	
	long f = Long.parseLong(args[5]);
	System.out.println(f);
	
	double g = Double.parseDouble(args[6]);
	System.out.println(g);
	
	boolean h = Boolean.parseBoolean(args[7]);
	System.out.println(h);
	
}
}
