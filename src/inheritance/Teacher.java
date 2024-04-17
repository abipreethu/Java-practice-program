package inheritance;

public class Teacher extends Human {
	private int  exp;
	private String sex;
	private String schName;

	public void setExp(int exp) {
		this.exp= exp;
	}
	public int getExp() {
		return exp;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSchName(String schName) {
		this.schName=schName;
	}
	public String getSchName() {
		return schName;
	}
	public Teacher(String name,int age,long phNo,int exp,String sex,String schName) {
		super(name,age,phNo);
		this.exp=exp;
		this.sex=sex;
		this.schName=schName;
	}
	public String toString() {
		return super.toString()+","+"Exp="+exp+", "+"Sex="+sex+", "+"SchName="+schName;
	}

}
