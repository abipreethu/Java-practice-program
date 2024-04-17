package Encapsulation;

public class UseAC {
public static void main(String[] args) {
	Compressor c = new Compressor();
	c.setPressor("cold");
	c.setBrand("xxx");
	c.setPrice(1500);
	c.setOlt(15);
	
	AC ac = new AC();
	ac.setBrand("sam");
	ac.setColor("white");
	ac.setModel("yyy");
	ac.setCompressor(c);
	
	System.out.println(ac.getBrand()+" "+ac.getColor()+" "+ac.getModel()+" "+ac.getPrice()+" "+ac.getCompressor().getBrand());
}
}
