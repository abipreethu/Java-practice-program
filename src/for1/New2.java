package for1;

public class New2 {
	public static void main(String[] args) {
		
		int a = 0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
				a=a+1;
			}
		}
			System.out.println(a);
			
			
			String b = "Onesoft";
			String c = "";
			for(int i=b.length()-1;i>=0;i--) {
				c=c+b.charAt(i);
				System.out.println(c);
			}
			
			
				String d = "Bottle";
				for (int i = 0; i <= d.length() - 1; i++) {
					if (d.charAt(i) == 'a' || d.charAt(i) == 'e' || d.charAt(i) == 'i' || d.charAt(i) == 'o'
							|| d.charAt(i) == 'u') {
						System.out.println(d.charAt(i));
					} 
					
						
					}
				
				String e = "OneSoFT";
				int x =0;
				int y=0;
				for(int i=0;i<=e.length()-1;i++) {
					if(Character.isUpperCase(e.charAt(i))) {
						x=x+1;
					}
					else if(Character.isLowerCase(e.charAt(i))) {
						y =y+1;
					}
			
				
					}
				System.out.println(x);
				System.out.println(y);
				
				}
				
			
		}

