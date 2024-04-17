package collection3;

public class Employee {
private String name;
private int age;
private int salary;
private String gender;
private int daysPresent;
private String shift;
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
public void setDaysPresent(int daysPresent) {
	this.daysPresent=daysPresent;
}
public int getDaysPresent() {
	return daysPresent;
}
public void setShift(String shift) {
	this.shift=shift;
}
public String getShift() {
	return shift;
}
public Employee(String name,int age,int salary,String gender,int daysPresent,String shift) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.gender=gender;
	this.daysPresent=daysPresent;
	this.shift=shift;
}
public String toString() {
	return "Name:"+name+","+"Age:"+age+","+"Salary:"+salary+","+"Gender:"+gender+","+"DaysPresent:"+daysPresent+","+"Shift:"+shift;
}
}
