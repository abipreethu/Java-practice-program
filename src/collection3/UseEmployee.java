 package collection3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class UseEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee("abi",23,55000,"female",280,"day");
	Employee e2 = new Employee("gayu",25,60000,"female",282,"day");
	Employee e3 = new Employee("divya",24,45000,"female",270,"night");
	Employee e4 = new Employee("prakash",22,50000,"male",276,"night");
	Employee e5 = new Employee("sandhu",20,40000,"female",260,"day");
	Employee e6 = new Employee("brindha",23,35000,"female",250,"night");
	Employee e7 = new Employee("sanju",20,30000,"male",254,"night");
	
	ArrayList<Employee> employees = new ArrayList<>();
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	employees.add(e6);
	employees.add(e7);
	
//	employees.stream().forEach(x->System.out.println(x));
	
//	employees.stream().filter(x->x.getGender().equals("male")).forEach(a->System.out.println(a));
	
//	List<Employee> a = employees.stream().filter(x->x.getName().startsWith("s")).collect(Collectors.toList());
//	a.forEach(z->System.out.println(z));
	
//	long a = employees.stream().filter(x->x.getShift().equals("night")).count();
//	System.out.println(a);
	
//	List<Employee> z = employees.stream().filter(x->x.getDaysPresent()>280).collect(Collectors.toList());
//	z.forEach(m->System.out.println(m));
	
//	employees.stream().filter(x->x.getName().length()%2==0).forEach(a->System.out.println(a));
	
//	List<String> z = employees.stream().map(x->x.getName()).collect(Collectors.toList());
//	z.forEach(y->System.out.println(y));
	
//	employees.stream().filter(x->x.getDaysPresent()>250).map(y->y.getGender()).forEach(m->System.out.println(m));
	
//	List<String> t = employees.stream().filter(x->x.getDaysPresent()>250).map(y->y.getGender()).collect(Collectors.toList());
//	t.forEach(d->System.out.println(d));
	
//	List<Employee> w =  employees.stream().filter(x->x.getGender().equals("female")).map(y->{
//		
//	y.setSalary(y.getSalary()+5000);
//	return y;
//}).collect(Collectors.toList());
//	w.forEach(t->System.out.println(t));
	
	employees.stream().filter(x->x.getDaysPresent()>250).peek(y->y.getGender()).forEach(m->System.out.println(m));

	
//	List<Employee> z = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
//	z.forEach(t->System.out.println(t));
	
//	List<Employee> z = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
//	z.forEach(t->System.out.println(t));
	
//	Employee y = employees.stream().min(Comparator.comparingInt(Employee::getAge)).get();
//	System.out.println(y);
	
//	Employee y = employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
//	System.out.println(y);
	
	
//	List<String> v = employees.stream().map(x->x.getName()).distinct().collect(Collectors.toList());
//	v.forEach(x->System.out.println(x));
	
//	List<Employee> w = employees.stream().limit(3).collect(Collectors.toList());
//	w.forEach(x->System.out.println(x));
	
//	List<Employee> w = employees.stream().filter(y->y.getAge()>22).skip(2).collect(Collectors.toList());
//	w.forEach(x->System.out.println(x));
	
//	int a = employees.stream().collect(Collectors.summingInt(Employee::getAge));
// System.out.println(a);
//	
//	Map<String,Employee> w = employees.stream().filter(x->x.getShift().equals("night")).collect(Collectors.toMap(x->x.getName(),y->y));
//	w.forEach((x,y)->System.out.println(x+","+y));
//	w.keySet().forEach(x->System.out.println(x));
//	w.values().forEach(x->System.out.println(x));
}
}
 