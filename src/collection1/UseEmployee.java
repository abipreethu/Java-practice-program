package collection1;

import java.util.ArrayList;

public class UseEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee("abi",23,"female");
	Employee e2 = new Employee("gayu",26,"female");
	Employee e3 = new Employee("divya",25,"female");
	Employee e4 = new Employee("prakash",22,"male");
	
	ArrayList<Employee> nums = new ArrayList<>();
	nums.add(e1);
	nums.add(e2);
	nums.add(e3);
	nums.add(e4);
	
	for(int i=0;i<nums.size();i++) {
//		System.out.println(nums.get(i));
	}
	
	for(int i=0;i<nums.size();i++) {
		if(nums.get(i).getGender().equals("male")) {
			System.out.println(nums.get(i).getName());
		}
	}
	ArrayList<Employee> newnums = new ArrayList<>();
	for(int i=0;i<nums.size();i++) {
		if(nums.get(i).getName().length()%2==0) {
			nums.get(i).setAge(nums.get(i).getAge()+10);
			newnums.add(nums.get(i));
			
		}
	}
	System.out.println(newnums);
	
	Employee max = e1;
	for(int i=0;i<nums.size();i++) {
		if(nums.get(i).getAge()>max.getAge()) {
			max = nums.get(i);
			
		}
	}
	System.out.println(max);
}
}
