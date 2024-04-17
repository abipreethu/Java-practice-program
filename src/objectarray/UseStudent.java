 package objectarray;

public class UseStudent {
public static void main(String[] args) {
	Student std1 = new Student();
	std1.name = "abi";
	std1.rollNo = 101;
	std1.fees = 30000;
	std1.gender = "female";
	std1.totalMarks = 450;
	
	Student std2 = new Student();
	std2.name = "sam";
	std2.rollNo = 102;
	std2.fees = 20000;
	std2.gender = "female";
	std2.totalMarks = 480;
	
	Student std3 = new Student();
	std3.name = "ram";
	std3.rollNo = 103;
	std3.fees = 45000;
	std3.gender = "male";
	std3.totalMarks = 400;
	
	Student std4 = new Student();
	std4.name = "moos";
	std4.rollNo = 104;
	std4.fees = 5000;
	std4.gender = "female";
	std4.totalMarks = 300;
	
	Student std5 = new Student();
	std5.name = "kavi";
	std5.rollNo = 105;
	std5.fees = 6000;
	std5.gender = "female";
	std5.totalMarks = 90;
	
	Student std6 = new Student();
	std6.name = "sasi";
	std6.rollNo = 106;
	std6.fees = 65000;
	std6.gender = "female";
	std6.totalMarks = 50;
	
	Student std7 = new Student();
	std7.name = "siva";
	std7.rollNo = 107;
	std7.fees = 70000;
	std7.gender = "male";
	std7.totalMarks = 82;
	
	
	Student[] std = {std1,std2,std3,std4,std5,std6,std7};
	
	for(int i=0;i<std.length;i++) {
		System.out.println(std[i].name+","+std[i].rollNo+","+std[i].fees+","+std[i].gender+","+std[i].totalMarks);
	}
//	
//	
//	for(int i=0;i<std.length;i++) {
//		if(std[i].name.startsWith("a")) {
//			System.out.println(std[i].name+","+std[i].rollNo+","+std[i].fees+","+std[i].gender+","+std[i].totalMarks);
//		}
//	}
	
//	for(int i=0;i<std.length;i++) {
//		if(std[i].totalMarks>80&&std[i].fees<30000) {
//			System.out.println(std[i].name+","+std[i].rollNo+","+std[i].fees+","+std[i].gender+","+std[i].totalMarks);
//		}
//	}
	
	//max fees
//	Student max = std[0];
//	for(int i=0;i<std.length;i++) {
//		if(std[i].fees>max.fees) {
//			max = std[i];
//		}
//	}
//			System.out.println(max.name+","+max.rollNo+","+max.fees+","+max.gender+","+max.totalMarks);
	
	
	
//	for(int i=0;i<std.length;i++) {
//		System.out.println(std[i].name+"="+std[i].totalMarks);
//	}
	
//	for(int i=0;i<std.length;i++) {
//		if(std[i].gender.equals("female")) {
//			System.out.println(std[i].name);
//		}
//	}
	
//	for(Student a : std) {
//		System.out.println(a.name+","+a.rollNo+","+a.fees+","+a.gender+","+a.totalMarks);
//	}
	
		}
	}
