package Encapsulation;

public class Employee {
private String name;
private int id;
private int salary;
private String role;

public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
public void setSalary(int salary) {
	this.salary=salary;
}
public int getSalary() {
	return salary;
}
public void setRole(String role) {
	this.role=role;
}
public String getRole() {
	return role;
}

public Employee(String name,int id,int salary,String role) {
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.role=role;
}

public String toString() {
	return "Name="+name+","+"Id="+id+","+"Salary="+salary+","+"Role="+role;
}
}
