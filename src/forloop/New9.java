package forloop;

public class New9 {
	public static void main(String[] args) {
		String a = "OneSOfT@#998";
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
			b = b + 1;
			} 
			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
			c = c + 1;
			}
			else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
			d = d + 1;
			}
			else {
		System.out.println(a.charAt(i));
			}
		}
		System.out.println("upper case"+b);
		System.out.println("lower case"+c);
		System.out.println("number"+d);
	}
}