package forloop;

public class New5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=10;i<=20;i++) {
			if(i%2==0) {
				sum = sum+1;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}

