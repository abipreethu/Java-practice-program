 package collection3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(7);
	arr.add(2);
	arr.add(3);
	arr.add(5);
	
//	List<Integer> z = arr.stream().sorted().collect(Collectors.toList());
//	z.forEach(t->System.out.println(t));
	
//	List<Integer> m = arr.stream().sorted(Comparator.comparing(Integer :: intValue).collect(Collectors.toList());
//	m.forEach(x->System.out.println(x));
//	
//	List<Integer> m = arr.stream().sorted(Comparator.comparing(Integer :: intValue).reversed()).collect(Collectors.toList());
//	m.forEach(x->System.out.println(x));
	
//	System.out.println(arr);
	
//	for(Integer a : arr) {
//		if(a%5==0) {
//			System.out.println(a);
//		}
//	}
	
	
	ArrayList<String> a = new ArrayList<>();
	a.add("abi");
	a.add("gayu");
	a.add("divya");
	a.add("prakash");
	a.add("sdfgh");
	
	Set<Integer>arr1=new HashSet<>();
     arr1.add(23);
     arr1.add(78);
     arr1.add(90);
     arr1.add(45);
     arr1.add(98);
     arr1.add(45);
     System.out.println(arr1);


	
	
     			
	
	
	

//	List<String> a = a.stream().sorted().collect(Collectors.toList());
//	a.forEach(x->System.out.println(x));
//	List<String> m = a.stream().filter(x->!x.equals("")).distinct().
//			collect(Collectors.toList());
//	m.forEach(n->System.out.println(n));
	
//	List<String> z = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//	z.forEach(t->System.out.println(t));
	
//	List<String> m = a.stream().sorted(Comparator.comparingInt(String :: length)).collect(Collectors.toList());
//	m.forEach(x->System.out.println(x));	

//	List<Character> n = a.stream().map(k->k.charAt(k.length()-2)).collect(Collectors.toList());
//	n.forEach(v->System.out.println(v));
	
}
}
 