package polymorphism;

public class Adder {
public String add(int a, int b) {
	return "Ans="+(a+b);
}
public String add(int a, float b) {
	return "Ans="+(a+b);
}
public String add(int a, int b, long c) { 
	return "Ans="+(a+b+c);
}
public String add(int a, float b, float c) {
	return "Ans="+(a+b+c);
}
}
