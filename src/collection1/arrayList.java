 package collection1;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(20);
		nums.add(50);
		nums.add(72);
		nums.add(48);
		nums.add(50);
		System.out.println(nums);
		nums.set(2, 54);
		System.out.println(nums);
		nums.remove(1);
		System.out.println(nums);
		System.out.println(nums.get(3));
		System.out.println(nums.size());
		
//		for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
//		enhanced for
//		for(Integer a : nums) {
//			System.out.println(a);
//		}
//		for(int i=0;i<nums.size();i++) {
//			if(nums.get(i)%2==0) {
//				System.out.println(nums.get(i));
//			}
//	}
			//forEach()
//			nums.forEach(x->System.out.println(x));
		
//		nums.forEach(x->{
//			if(x%2==0) {
//				System.out.println(x);
//			}
//		});
		
		nums.forEach(x->{
			if(x%4==0&&x%5==0) {
				System.out.println(x);
			}
		});
		}
	}

 