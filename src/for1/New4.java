package for1;

public class New4 {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==4) {
				System.out.println(i);
				break;
			}
			else {
				System.out.println(i);
			}
		}
		for(int i=0;i<=10;i++) {
			if(i==4) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
			
				continue;
			}
			else {
				System.out.println(i);
	}

}
}
}