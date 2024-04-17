package objectarray;

public class task {
	public static void main(String[] args) {
		int num = 15;
		
		for(int i=1;i<=num;i++) {
			boolean isPrime = true;
		
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime = false;
			} 
		}
		if(isPrime==true) {
		System.out.println(i+"is Prime number");
		}
		else {
			System.out.println(i+"is not a prime number");
		}
	}
		
//		int[] nums = {15,14,9,8,7,6};
//		for(int i=0;i<nums.length;i++) {
//			boolean isPrime = true;
//		
//		for(int j=2;j<nums[i];j++) {
//			if(nums[i]%j==0) {
//				isPrime = false;
//			}
//		}
//		if(isPrime==true) {
//		System.out.println(nums[i]+"is Prime number");
//		}
//		else {
//			System.out.println(nums[i]+"is not a prime number");
//		}
//	}
		
	}
}
