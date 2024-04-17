package collection3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
public class UseStudents {
public static void main(String[] args) {
	Students s1 = new Students("",23,101,"cse",90);
	Students s2 = new Students("gayu",25,102,"cse",80);
	Students s3 = new Students("divya",24,103,"cse",85);
	Students s4 = new Students("prakash",22,104,"cse",92);
	Students s5 = new Students("sandhu",21,105,"cse",70);
	HashMap<Integer,Students> studs = new HashMap<>();
	studs.put(s1.getRollNo(), s1);
	studs.put(s2.getRollNo(), s2);
	studs.put(s3.getRollNo(), s3);
	studs.put(s4.getRollNo(), s4);
	studs.put(s5.getRollNo(), s5);
	studs.forEach((x,y)->System.out.println(x+","+y));
	
	for(Entry<Integer, Students> a : studs.entrySet()) {
		if(a.getValue().getName().startsWith("a")){
		System.out.println(a.getKey()+""+a.getValue());
		}
	}
	
	ArrayList<Students> sts = new ArrayList<>();
	sts.add(s1);
	sts.add(s2);
	sts.add(s3);
	sts.add(s4);
	sts.add(s5);
	
	
	
	
//	for(int j=0;j<sts.size();j++) {
//	int num = sts.get(j).getAge();
//	boolean flag = true;
//	for(int i=2;i<num;i++) {
//		if(num%i==0) {
//			flag = false;
//	}
//		}
//	
//if(flag==true) {
//	System.out.println(num+" is prime");
//}
//
//	}
//	for(int j=0;j<sts.size();j++) {
//	String b = sts.get(j).getName();
//	String a = "";
//	for(int i=b.length()-1;i>=0;i--) {
//		a=a+b.charAt(i);
//	}
//	if(b.equals(a)) {
//		System.out.println(b+" palindrome");
//	}
//	else {
//		System.out.println(b+" not a palindrome");
//	}
//	}
	
	
	
}
}

