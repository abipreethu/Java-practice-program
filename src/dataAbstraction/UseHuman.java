package dataAbstraction;

public class UseHuman {
public static void main(String[] args) {
	Mother m = new Mother();
	System.out.println(m.gender("Female"));
	System.out.println(m.name("Kani"));
	System.out.println(m.phn(923456789));
	System.out.println(m.age(40));
}
}
