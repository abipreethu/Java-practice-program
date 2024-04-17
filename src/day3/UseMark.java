package day3;

public class UseMark {
	public static void main(String[] args) {
		String[] show = args[0].split(",");
		Mark m = new Mark();
		m.tamil = Integer.parseInt(show[0]);
		m.english = Integer.parseInt(show[1]);
		m.maths = Integer.parseInt(show[2]);
		System.out.println(m.tamil + " " + m.english + " " + m.maths);

		String[] high = args[1].split("#");
		m.tamil = Integer.parseInt(high[0]);
		m.english = Integer.parseInt(high[1]);
		m.maths = Integer.parseInt(high[2]);
		System.out.println(m.tamil + " " + m.english + " " + m.maths);

		String[] range = args[2].split("@");
		m.tamil = Integer.parseInt(range[0]);
		m.english = Integer.parseInt(range[1]);
		m.maths = Integer.parseInt(range[2]);
		System.out.println(m.tamil + " " + m.english + " " + m.maths);
	}
}
