package Encapsulation;

public class UseTV {
public static void main(String[] args) {
	Remote r = new Remote();
	r.setPrice(300);
	r.setBrand("XXX");
	
	TV tv = new TV();
	tv.setBrand("panasonic");
	tv.setPrice(50000);
	tv.setRemote(r);
	
	
	System.out.println(tv);
}
}
