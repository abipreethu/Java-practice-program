package collection2;

import java.util.HashMap;

public class Task2 {
public static void main(String[] args) {
	HashMap<Integer,String> nums = new HashMap<>();
	nums.put(1,"abi");
	nums.put(2,"gayu");
	nums.put(3,"divya");
	nums.put(4,"prakash");
	
	for(Integer a:nums.keySet()) {
		System.out.println(a);
	}
	for(String a:nums.values()) {
		System.out.println(a);
	}
	for(Integer a:nums.keySet()) {
		System.out.println(a+":"+nums.get(a));
	}
	for(Integer a:nums.keySet()) {
		if(nums.get(a).startsWith("a")) {
			System.out.println(nums.get(a));
		}
	}
	nums.forEach((x,y)->System.out.println(x+","+y));
	nums.keySet().forEach(x->System.out.println(x));
	nums.values().forEach(x->System.out.println(x));
	nums.keySet().forEach(x->System.out.println(nums.get(x)));
	nums.remove(1);
	nums.forEach((x,y)->System.out.println(x+","+y));
}
}
