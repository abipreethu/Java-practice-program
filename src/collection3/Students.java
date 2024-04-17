package collection3;

public class Students {
private String name;
private int age;
private int rollNo;
private String dept;
private int semMark;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSemMark() {
	return semMark;
}
public void setSemMark(int semMark) {
	this.semMark = semMark;
}
public Students(String name, int age, int rollNo, String dept, int semMark) {
	this.name = name;
	this.age = age;
	this.rollNo = rollNo;
	this.dept = dept;
	this.semMark = semMark;
}

public String toString() {
	return "name="+name+","+"age="+age+","+"rollNo="+rollNo+","+"dept="+dept+","+"semMark="+semMark;
}






}
