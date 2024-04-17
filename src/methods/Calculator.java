package methods;

public class Calculator {
public void add() {
	int a = 10;
	int b = 20;
System.out.println(a+b);
}
public String sub() {
	int a = 10;
	int b = 5;
	return "the sub value is "+(a-b);
}
public int multiple(int a,int b) {
	return a*b;
}
public void div(float a,float b) {
	System.out.println(a/b);
}
public void total(int a,float b,String c,double d) {
	System.out.println(a*b);
	System.out.println(a/d); 
}
public String findOddEven(int a) {
	if(a%2==0) {
		return "this is Even";
	}
		else {
			return "this is Odd";
		}
	}
public String findPrime(int a) {
	boolean flag = true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			flag = false;
		}
	}
	
	if(flag==true) {
		return "this is prime";
	}
	else {
		return "this is not prime";
	}
}
public void findfabi(int a) {
	int x = 0;
	int y = 1;
	for(int i=1;i<a;i++) {
	int c = x+y;
System.out.println(x);
	x=y;
	y=c;
	}

}

public void prime(int a,int b) {
	for(int i=a;i<=b;i++) {
		boolean flag = true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag = false;
			}
		}
		if(flag==true) {
			System.out.println(i+"is a prime number");
		}
	}
}

public String max(int[] a) {

int max = a[0];
for(int i=0;i<a.length;i++) {
	
		if(a[i]>max) {
		max = a[i];	
		}
	}
return "this is max value "+(max);
}


public void findDup(String a) {
	char[] b = a.toCharArray();
	for(int i=0;i<b.length;i++) {
		int count = 0;
		for(int j=i+1;j<b.length;j++) {
			if(b[i]==b[j]) {
				count++;
				b[j] = '@';
			}
		}
		if(count!=0&&b[i]!='@') {
			System.out.println(b[i]);
			}
		}
	}
}


