package collection2;

public class Student {
private String name;
private int age;
private int fees;

public void setName(String name) {
	this.name=name;
}
	public String getName() {
		return name;
	}
public void setAge(int age)  {
	this.age=age;
}
public int getAge() {
	return age;
}
public void setFees(int fees) {
	this.fees=fees;
}
public int getFees() {
	return fees;
}
public Student(String name,int age,int fees) {
	this.name=name;
	this.age=age;
	this.fees=fees;
}
public String toString() {
	return "Name:"+name+","+"Age:"+age+","+"Fees:"+fees;
}
}
