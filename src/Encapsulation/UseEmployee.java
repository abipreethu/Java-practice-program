package Encapsulation;

public class UseEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee("abi",101,60000,"java developer");
//	e1.setName("abi");
//	e1.setId(101);
//	e1.setSalary(600000);
//	e1.setRole("java developer");
	
	Employee e2 = new Employee("gayu",102,40000,"java developer");
//	e2.setName("gayu");
//	e2.setId(102);
//	e2.setSalary(400000);
//	e2.setRole("java developer");
	
	Employee e3 = new Employee("divya",103,90000,"java developer");
	Employee e4 = new Employee("ram",104,80000,"phyton");
//	e3.setName("abi");
//	e3.setId(101);
//	e3.setSalary(300000);
//	e3.setRole("java developer");
	
	Employee[] employees = {e1,e2,e3,e4};
	
	for(int i=0;i<employees.length;i++) {
		if(employees[i].getSalary()>50000&&employees[i].getRole().equals("java developer")) {
		System.out.println(employees[i]);	
		}
	}
}
}

