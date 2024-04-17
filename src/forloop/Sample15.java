package forloop;

public class Sample15 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int total=0;
		for(int i=0;i<=5;i++) {
			c=a+b;
			total=total+c;
			System.out.println(a);
			a=b;
			b=c;
		}
		System.out.println(total);
	}

}
