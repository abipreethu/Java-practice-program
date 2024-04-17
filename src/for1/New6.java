package for1;

public class New6 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int count=0;
		for(int i=1;i<=7;i++) {
			int c = a+b;
			count=count+1;
			System.out.println(a);
			a=b;
			b=c;
			
		}
		System.out.println(count);
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i=1;i<=10;i++) {
			 int num3 = num1+num2;
			 System.out.println(num1);
			 num1=num2;
			 num2=num3;
		}
		
	}

}
