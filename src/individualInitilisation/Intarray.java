package individualInitilisation;

public class Intarray {
	public static void main(String[] args) {
		int[] nums = new int[5];
		int count = 0;
		nums[0] = 2;
		nums[1] = 4;
		nums[2] = 18;
		nums[3] = 19;
		nums[4] = 13;

//	for(int i=0;i<nums.length;i++) {
//		System.out.println(nums[i]);
//	}

		// find odd nums total
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] % 2 != 0) {
//				count = count + nums[i];
//			}
//		}
		// System.out.println(count);
		
		
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println(min);

		
//		int  min = nums[0];
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] < min) {
//				min = nums[i];
//			}
//		}
//		System.out.println(min);
	
	}
}
