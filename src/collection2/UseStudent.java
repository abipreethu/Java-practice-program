package collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
public static void main(String[] args) {
	Student s1 = new Student("abi",23,5000);
	Student s2 = new Student("gayu",26,8000);
	Student s3 = new Student("divya",25,6000);
	Student s4 = new Student("prakash",22,9000);
	
	HashMap<Integer,Student> vals = new HashMap<>();
	vals.put(1, s1);
	vals.put(2, s2);
	vals.put(3, s3);
	vals.put(4, s4);
	
	for(Integer a:vals.keySet()) {
		System.out.println(a);
	}
	
	for(Student a:vals.values()) {
		System.out.println(a);
	}
	
	vals.keySet().forEach(x->System.out.println(x));
	
	HashMap<Integer,Student> newvals = new HashMap<>();
	for(Integer a:vals.keySet()) {
		if(vals.get(a).getName().equals("abi")) {
		 	newvals.put(1, vals.get(a));
		}
	}
	System.out.println(newvals);	
	
	Iterator<Student> it = vals.values().iterator();
	while(it.hasNext()) {
		if(it.next().getName().equals("abi")) {
			it.remove();
		}
	}
	vals.forEach((x,y)->System.out.println(x+","+y));
	}
}

