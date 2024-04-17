package forloop;

public class Sample11 {
	public static void main(String[] args) {
		for (int i = 25; i >= 1; i--) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);

			}
		}
		for (int i = 25; i >= 1; i--) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
