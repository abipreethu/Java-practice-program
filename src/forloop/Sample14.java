package forloop;

public class Sample14 {
	public static void main(String[] args) {
		int num = 7;
		boolean flag = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag = false;
		}
			}
		System.out.println(flag);
	if(flag==true) {
		System.out.println("is prime");
	}
	else {
		System.out.println("is not a prime");
		}
	}

}
