package bulkInitilisation;

public class Intarray {
	public static void main(String[] args) {
		int[] nums = {24,6,35,85,4,56,23,9};
		int max = nums[0];
		for(int i=0;i<nums.length;i++) {
			//System.out.println(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				//System.out.println(nums[i]);
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<60) {
				//System.out.println(nums[i]);
			}
		}
		
		//enhanced for
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];	
			}
		}
		System.out.println(max);
		
		
		for(int a : nums) {
			System.out.println(a);
		}
	}

}
