package forloop;

public class s {
	public static void main(String[] args) {
		int num=6;
		int count = 0;
		for(int i=2;i<5;i++) {
			if(num%i==0) {
				count=count+1;
		}
			}
		System.out.println(count);
		if(count==0) {
			System.out.println("is prime");
		}
	else {
		System.out.println("is not prime");
	}
	}
}