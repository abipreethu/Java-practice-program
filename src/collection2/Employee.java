package collection2;

public class Employee {
private int id;
private String name;
private int age;
private int salary;
private String gender;
private String shift;

public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}
public void setSalary(int salary) {
	this.salary=salary;
}
public int getSalary() {
	return salary;
}
public void setGender(String gender) {
	this.gender=gender;
}
public String getGender() {
	return gender;
}
public void setShift(String shift) {
	this.shift=shift;
}
public String getShift() {
	return shift;
}
public Employee(int id,String name,int age,int salary,String gender,String shift) {
	this.id=id;
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.gender=gender;
	this.shift=shift;
}
public String toString() {
	return "Id="+id+", Name="+name+", Age="+age+", Salary="+salary+", Genger="+gender+", Shift="+shift;
}
}
