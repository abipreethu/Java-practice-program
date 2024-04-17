package forloop;

public class New4 {
	public static void main(String[] args) {
		int sum = 1;
		for(int i=10;i<=20;i++) {
			if(i%2==0) {
				sum = sum*i;
			}
		}
		System.out.println(sum);
	}

}
