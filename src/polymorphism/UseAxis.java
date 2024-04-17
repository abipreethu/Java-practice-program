package polymorphism;

public class UseAxis {
public static void main(String[] args) {
	RBI r = new RBI();
	System.out.println(r.findInterest(500000));
	
	Axis a = new Axis();
	System.out.println(a.findInterest(500000));

	RBI r1 = new Axis();
	System.out.println(r1.findInterest(500000));
}
}
