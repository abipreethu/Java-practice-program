package inheritance;

public class UseStationery {
public static void main(String[] args) {
	Pen p = new Pen("ramshop",10,"pondy","xxx","red",50);
	
	System.out.println(p+", Is Worth = "+p.findWorth(50)+",  Is Color = "+p.findIsColor(p.getColor()));
	
}
}
