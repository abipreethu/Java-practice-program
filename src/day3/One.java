package day3;

public class One {
public static void main (String [] args) {
	String a = args[0];
	char b = a.charAt(0);
	char c = a.charAt(a.length()-2);
	char d = a.charAt(a.length()/2);
	int e = a.indexOf("h");
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
}
}
