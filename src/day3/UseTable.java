package day3;

public class UseTable {
public static void main(String [] args) {
	Table t = new Table();
	t.brand = args[0];
	t.price = Integer.parseInt(args[1]);
	t.color = args[2];
	t.isWood = Boolean.parseBoolean(args[3]);
	t.inch =  Float.parseFloat(args[4]);
	System.out.println(t.brand+" "+t.price+" "+t.color);
}
}
