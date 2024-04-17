package forloop;

public class Sample12 {
	public static void main(String[] args) {
		String a = "Bottle";
		for (int i = 0; i <= a.length() - 1; i++) {
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u') {
				continue;
			} 
			else {
				System.out.println(a.charAt(i));
			}
		}
	}
}
