package forloop;

public class Sample9 {
	public static void main(String[] args) {
		String a = "java";
		String ram = " ";
		for (int i=a.length()-1;i>=0;i--) {
			ram = ram+a.charAt(i);
		}
		System.out.println(ram);
	}
}
