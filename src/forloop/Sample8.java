package forloop;

public class Sample8 {
	public static void main(String[] args) {
		for (int i=10;i>=1;i--) {
			System.out.println(i+100);
		}
		int total=0;
		for(int i=1;i<=5;i++) {
			total = total+i;
		}
		System.out.println(total);
		
	int sam=1;
	for(int i=1;i<=5;i++) {
		sam = sam*i;
	}
System.out.println(sam);
}
}