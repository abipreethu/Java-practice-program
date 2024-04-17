package for1;

public class New5 {
	public static void main(String[] args) {
		String a = "mom";
		String b = "";
		for(int i=a.length()-1;i>=0;i--) {
			b = b+a.charAt(i);
			
			
		}
		System.out.println(b);
			if(a.equals(b)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
			
			String m = "father";
			String n ="";
			for(int i=m.length()-1;i>=0;i--) {			
			n = n+m.charAt(i);
			
			}
			System.out.println(n);
			if(n.equals(m)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
	}

}
