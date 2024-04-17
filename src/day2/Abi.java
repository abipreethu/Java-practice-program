package day2;

public class Abi {
public static void main (String [] args) {
	StringBuffer famname = new StringBuffer("Amma");
	System.out.println(famname);
	famname.append("appa");
	System.out.println(famname);
	
	StringBuffer name = new StringBuffer("java");
	System.out.println(name.reverse());
	
	
	String a = "java";
	
	for(int i=a.length()-1;i>=0;i--) {
		
		System.out.print(a.charAt(i));
	}
}
}
