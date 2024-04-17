package day2;

public class Array {
	public static void main(String [] args){
	char[] initial = {'A','B','C'};
	System.out.println(initial[2]);
	
	
	String a = "Character";
	char[] b = a.toCharArray();
	System.out.println(b[3]);
	
	String a1 = "Lo+ptop";
	String[] b1 = a1.split("\\+");
	System.out.println(b1[0]);
	
	String x = "Butter24";
	String[] y = x.split("[0-9]");
	System.out.println(y);
	
	
	
	}
}
