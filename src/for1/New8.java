package for1;

public class New8 {
	public static void main(String[] args) {
//		int num = 7;
//		boolean flag = true;
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				flag = false;
//		}
//			}
//		System.out.println(flag);
//	if(flag==true) {
//		System.out.println("is prime");
//	}
//	else {
//		System.out.println("is not a prime");
//		}
//	
//	
//	
//	int a = 10;
//	boolean cond = true;
//	for(int i=2;i<a;i++) {
//	if(a%i==0) {
//		cond=false;
//	}
//	}
//	System.out.println(cond);
//	if(cond==true) {
//		System.out.println("prime");
//	}
//	else {
//		System.out.println("not a prime");
//	}
	
	int b =10;
	for(int i=1;i<=b;i++) {
		
	boolean condi = true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				condi = false;
				
			}
		}
		
		if(condi==true) {
			System.out.println(i+": prime");
		}
//		else {
//			System.out.println(i+": not a prime");
//		}
	}
	
	
	
	
	}
	}

