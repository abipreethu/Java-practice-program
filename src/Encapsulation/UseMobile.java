package Encapsulation;

public class UseMobile {
public static void main(String[] args) {
//	Battery b = new Battery();
//	b.setBrand("samsong");
//	b.setCapacity(120);
//	b.setPrice(500);
//	 
//	
//	Mobile m = new Mobile();
//	m.setPrice(50000);
//	m.setBrand("samsong");
//	m.setModel("xxx");
//	m.setBattery(b);
//	
//	System.out.println(m.getBrand()+" "+m.getBattery().getCapacity());
	
	
	Battery b = new Battery(4200);
	Mobile m = new Mobile("sam",5000,b);
	m.setBrand("oppo");
	System.out.println(m);
	
 }
}
