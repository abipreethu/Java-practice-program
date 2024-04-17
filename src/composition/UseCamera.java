package composition;

public class UseCamera {
	public static void main(String[] args) {
		Lens l = new Lens();
		l.isConcave = true;
		l.price = 500;
		
		
		Camera c = new Camera();
		c.brand = "####";
		c.price = 1000;
		c.color = "black";
		c.lens = l;
		
		System.out.println(c.brand+" "+c.price+" "+c.color+" "+c.lens.isConcave+" "+c.lens.price);
		
	}
}
