package objectarray;

public class Task1 {
public static void main(String[] args) {
//	int[] nums = {8,3,2,4,4,2,4,9,8};
//	int count = 0;
//	for(int i=0;i<nums.length;i++) {
//		if(nums[i]==-1) {
//			continue;
//		}
//		for(int j=i+1;j<nums.length;j++) {
//			if(nums[i]==nums[j]) {
//				count++;
//				nums[j] = -1;
//			}
//		}
//	}
//	System.out.println(count);
	
//	int[] nums = {8,3,2,4,4,2,4,9,8};
//	int count = 0;
//	for(int i=0;i<nums.length;i++) {
//		if(nums[i]==-1) {
//			continue;
//		}
//		int indivcount = 0;
//		for(int j=i+1;j<nums.length;j++) {
//			if(nums[i]==nums[j]) {
//				count++;
//				nums[j] = -1;
//				indivcount++;
//			}
//		}
//		System.out.println(nums[i]+","+indivcount);
//	}
//	System.out.println(count);
//	
	
	
	int[] nums = {8,3,2,4,4,2,4,9,8};
	int count = 0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==-1) {
			continue;
		}
		int indivcount = 1;
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]==nums[j]) {
				count++;
				nums[j] = -1;
				indivcount++;
			}}
			if(indivcount>1) {
				System.out.println(nums[i]);
			}
		}
	
	System.out.println(count);
	
	
	
//	String val = "targaryan";
//	char[] values = val.toCharArray();
//	
//	int count = 0;
//	for(int i=0;i<values.length;i++) {
//		int indivcount = 0;
//		if(values[i]=='@') {
//			continue;
//		}
//		
//		for(int j=i+1;j<values.length;j++) {
//			if(values[i]==values[j]) {
//				count++;
//				values[j]='@';
//				indivcount++;
//			}
//			}
//			if(indivcount>0) {
//				System.out.println(values[i]);
//				System.out.println(values[i]+"="+indivcount);
//			}
//			else {
//				System.out.println(values[i]);
//			}
//		}
//	
//	System.out.println(count);
}
}

