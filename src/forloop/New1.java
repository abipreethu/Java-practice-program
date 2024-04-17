package forloop;

public class New1 {
	public static void main(String[] args) {
		String a = "Arena";
		int b = 0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U') {
				b=b+1;
			}
		
		}
		System.out.println(b);
		
		
		
		String c = "school";
		int count =0;
		for(int i=0;i<=c.length()-1;i++) {
		if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u') {
			count = count + 1;
			System.out.println(c.charAt(i));
		}
		
		}
		System.out.println(count);
	}
	}

