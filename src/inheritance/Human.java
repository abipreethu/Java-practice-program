package inheritance;

public class Human {
private String name;
private int age;
private long phNo;

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
public void setPhNo(long phNo) {
	this.phNo=phNo;
}
public long getPhNo() {
	return phNo;
}
public Human(String name,int age,long phNo) {
	this.name=name;
	this.age=age;
	this.phNo=phNo;
}
public String toString() {
	return "Name="+name+", "+"Age="+age+", "+"PhNo="+phNo;
}
}
