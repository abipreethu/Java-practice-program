package day1;

import java.util.Arrays;

public class New1 {
	public static void main(String[] args) {
		String role = "development";
		System.out.println(role.substring(4));
		System.out.println(role.substring(0,7));
		System.out.println(role.substring(2,5));
		
		String c = "ranjith";
		char[] d = c.toCharArray();
		System.out.println(d[0]);
		
		String e = "ramkumar";
		String[] f = e.split("m");
		System.out.println(f[0]+" "+f[1]+" "+f[2]);
		
		String a = "bottle";
		String[] b = a.split("t");
		System.out.println(b[1]);
		
		
		String g = "turtle";
		String[] h = g.split("t");
		System.out.println(h[0]);
		
		
		String i = "S1of2@arEengg";
		//String[] j = i.split("[a-z]");
		String[] j = i.split("[0-9,A-Z]");
		System.out.println(Arrays.toString(j));	
		
		
		String k = "raj@1$bsp *Mg# a+S5mv";
		//String[] l = k.split("\\D");
		//String[] l = k.split("\\d");
		//String[] l = k.split("\\s");
		//String[] l = k.split("\\S");
		//String[] l = k.split("\\W");
		String[] l = k.split("\\w");
		System.out.println(Arrays.toString(l));
		
		String x = "Raja1ka1u@gmail.com";
		String[] y = x.split("[0-9]");
		System.out.println(y[1]);
		
		
		
	}
}
