package collection1;

public class Employee {
private String name;
private int age;
private String gender;

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

public void setGender(String gender) {
	this.gender=gender;
}
public String getGender() {
	return gender;
}

public Employee(String name,int age,String gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
}
public String toString() {
	return "Name:"+name+", "+"Age:"+age+", "+"Gender:"+gender;
}
}
