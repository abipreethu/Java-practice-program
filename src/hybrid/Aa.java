package hybrid;

public class Aa {
	public static void main(String[] args) {
int[] nums = {24,6,92,58,62,75,42};
int max = nums[0];
int secMax = max;
for(int i=0;i<nums.length;i++) {
	if(nums[i]>max) {
		max = nums[i];
		}
		if(nums[i]>secMax&&nums[i]<max) {
			secMax = nums[i];
			
		}
	}
	
System.out.println(max);
System.out.println(secMax);
}
}
