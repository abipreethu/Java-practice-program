package forloop;

public class Sample13 {
	public static void main(String[] args) {
		String word = "ONEsoft#@994033";
		int count = 0;
		for(int i=0;i<=word.length()-1;i++) {
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z') {
				count = count+1;
				System.out.println(word.charAt(i));
			}
			}
		System.out.println(count);
	
					
		}
}