package methods;

public class UseCalculator {
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.add();
	System.out.println(c.sub());
	System.out.println(c.multiple(10, 5));
	c.div(1.2f, 2.3f);
	c.multiple(10,20);
	c.div(28, 54);
	System.out.println(c.findOddEven(7));
	System.out.println(c.findPrime(7));
	c.findfabi(10);
	c.prime(5, 50);
	int[] a = {2,4,6,8};
	System.out.println(c.max(a));
	int[] b = {29,34,56,76};
	System.out.println(c.max(b));
	c.findDup("Appllleeeele");
}
}
