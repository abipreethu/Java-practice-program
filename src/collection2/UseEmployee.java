package collection2;
import java.util.HashMap;
import java.util.Iterator;
public class UseEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee(01,"abi",23,50000,"female","day");
	Employee e2 = new Employee(02,"gayu",25,55000,"female","day");
	Employee e3 = new Employee(03,"divya",24,60000,"female","night");
	Employee e4 = new Employee(04,"prakash",22,66000,"male","night");
	Employee e5 = new Employee(05,"santha",21,40000,"female","day");
	Employee e6 = new Employee(06,"brindha",23,30000,"female","night");
	Employee e7 = new Employee(07,"sanju",29,35000,"male","night");
	
	HashMap<Integer,Employee> employees = new HashMap<>();
	employees.put(e1.getId(),e1);
	employees.put(e2.getId(),e2);
	employees.put(e3.getId(),e3);
	employees.put(e4.getId(),e4);
	employees.put(e5.getId(),e5);
	employees.put(e6.getId(),e6);
	employees.put(e7.getId(),e7);
//	System.out.println(employees);
//	System.out.println(employees.keySet());
//	System.out.println(employees.values());
//	
//	for(Integer x : employees.keySet()) {
//		System.out.println(x+"="+employees.get(x));
//	}
//	employees.keySet().forEach(x->System.out.println(x+"="+employees.get(x).getName());
//	employees.forEach((x,y)->System.out.println(x+"="+y));
	
//	for(Integer a: employees.keySet()) {
//	if(employees.get(a).getAge()>28) {
//		System.out.println(employees.get(a));
//	}
//	}
//	employees.values().forEach(x->{
//		if(x.getShift().equals("night")) {
//			System.out.println(x);
//		}
//	});
	
	HashMap<Integer,Employee> newemployees = new HashMap<>();
	for(Employee a: employees.values()) {
		if(a.getSalary()>60000) {
			newemployees.put(a.getId(),a);
		}
	}
	newemployees.forEach((x,y)->System.out.println(x+""+y));
	
//	employees.values().forEach(a->{
//		if(a.getGender().equals("female")) {
//			a.setSalary(a.getSalary()+(a.getSalary()+25/100));
//		}
//	});
//	System.out.println(employees);
//	Iterator<Employee> itr = employees.values().iterator();
//while(itr.hasNext()) {
//	if(itr.next().getShift().equals("day")) {
//		itr.remove();
//	}
//}
//	employees.forEach((x,y)->System.out.println(x+","+y));
}
}
