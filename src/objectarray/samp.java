package objectarray;

public class samp {
	public static void main(String[] args) {

//int a = 2024;
//int b = 0;	
//	for(;a>0;) {
//		int rem = a%10;
//			b = b+rem;
//			a = a /10;
//}
//	System.out.println(b);
		
		
//		int[] a = {10,14,5,7,2};
//		int b = 0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//				b = a[i];
//				a[i] = a[j];
//				a[j] = b;
//				}
//			}
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		int[] a = {10,14,5,7,2};
		int b = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				b = a[i];
				a[i] = a[j];
				a[j] = b;
				}
			}
		}
		
//			System.out.println(abs.toString(a));
		}
}
