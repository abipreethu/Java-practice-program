package inheritance;

public class CompTeacher extends Teacher {
	private String subName;
	private boolean iscompTeacher;
	private int salary;

	public void setSubName(String subName) {
		this.subName=subName;
	}
	public String getSubName() {
		return subName;
	}
	public void setIsCompTeacher(boolean iscompTeacher) {
		this.iscompTeacher=iscompTeacher;
	}
	public boolean getIsCompTeacher() {
		return iscompTeacher;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public long getSalary() {
		return salary;
	}
	public CompTeacher(String name,int age,long phNo,int exp,String sex,String schName,String subName,boolean iscompTeacher,int salary) {
		super(name,age,phNo,exp,sex,schName);
		this.subName=subName;
		this.iscompTeacher=iscompTeacher;
		this.salary=salary;
	}
	public String toString() {
		return super.toString()+"SubName="+subName+", "+"Is compTeacher="+iscompTeacher+", "+"Salary="+salary;
	}

}
