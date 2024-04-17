package for1;

public class new1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i=i+1) {
			System.out.println("hello");
		}
		
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		
		for(int i=5;i>=1;i--) {
			System.out.println(i*i);
		}
		
		for(int i=777;i<=999;i++) {
			System.out.println(i);
		}
		
		for(int i=10;i>=0;i=i-2) {
			System.out.println(i);
		}
		
		String a = "program";
		for(int i=0;i<=a.length()-1;i++) {
			System.out.println(a.charAt(i));
		}
		
		String b = "program";
		for(int i=b.length()-1;i>=0;i--) {
			System.out.println(b.charAt(i));
		}
		
		String c = "program";
		for(int i=0;i<=c.length()/2;i++) {
			System.out.println(c.charAt(i));
		}
		
		String e = "program";
		for(int i=e.length()/2;i<=e.length()-1;i++) {
			System.out.println(e.charAt(i));
		}
		
		
		String f = "java";
		String g ="";
		for(int i=f.length()-1;i>=0;i--) {
		g=g+f.charAt(i);
		}
		System.out.println(g);
//		
		int x = 0;
		for(int i=1;i<=5;i++) {
			x =x+i;
		}
		System.out.println(x);
	}
//
}

