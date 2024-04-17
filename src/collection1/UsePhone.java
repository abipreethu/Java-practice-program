package collection1;
import java.util.ArrayList;
public class UsePhone {
public static void main(String[] args) { 
	Phone p1 = new Phone("samsung",10000,"blue",7.5f,true,5000);
	Phone p2 = new Phone("redmi",15000,"black",8.2f,false,4000); 
	Phone p3 = new Phone("apple",12000,"red",8.4f,true,3000);
	Phone p4 = new Phone("oneplus",17000,"pink",9.2f,false,2000);
	Phone p5 = new Phone("ee",9000,"white",8.9f,true,2500);
	Phone p6 = new Phone("ff",18000,"gray",7.2f,false,3500);
	Phone p7 = new Phone("gg",60000,"red",9.5f,true,3200);
	
	ArrayList<Phone> phones = new ArrayList<>();
	phones.add(p1);
	phones.add(p2);
	phones.add(p3);
	phones.add(p4);
	phones.add(p6);
	phones.add(p7);
	
//	for(int i=0;i<phones.size();i++) {
//		System.out.println(phones.get(i));
//	}
//	for(Phone a:phones) {
//		System.out.println(a);
//	}
//	phones.forEach(x->System.out.println(x));
	
//	for(int i=0;i<phones.size();i++) {
//		if(phones.get(i).getPrice()>30000) {
//			System.out.println(phones.get(i));
//		}
//	}
//	phones.forEach(x->{
//		if(x.getBrand().startsWith("s")) {
//			System.out.println(x);
//		}
//	});
	
//	phones.forEach(x->{
//		if(x.getRating()>8.5f&&x.getPrice()<40000) {
//		System.out.println(x);
//	}
//	});
	
//	phones.forEach(x->{
//		if(x.getBrand().equals("apple")&&x.getRating()<9.0) {
//			System.out.println(x);
//		}
//	});
//	for(Phone a:phones) {
//		if(a.getRating()>9.0f) {
//			a.setPrice(a.getPrice()+(a.getPrice()*10/100));
//			System.out.println(a);
//		}
//	}
	
//	for(int i=0;i<phones.size();i++) {
//		if(phones.get(i).getRating()>9.0f) {
//			phones.get(i).setPrice(phones.get(i).getPrice()+(phones.get(i).getPrice()*10/100));
//			System.out.println(phones.get(i));
//		}
//	}
	
//	phones.forEach(x->{
//		if(x.getBrand().equals("samsung")) {
//			x.setColour("gold");
//			System.out.println(x);
//		}
//	});
	
//	ArrayList<Phone> newph = new ArrayList<>();
//	phones.forEach(x-> {
//		if(x.getPrice()>50000) {
//			newph.add(x);
//		}
//	});
//	newph.forEach(x-> System.out.println(x));
	
	
//	Phone max =p1;
//	for(Phone a:phones) {
//		if(a.getPrice()>max.getPrice()) {
//			max=a;
//		}	}
//		System.out.println(max.getBrand());
	
//	Phone max =p1;
//	for(int i=0;i<phones.size();i++) {
//		if(phones.get(i).getRating()>max.getRating()) {
//			max=phones.get(i);
//		}	
//		}
//	ArrayList<Phone> newph = new ArrayList<>();
//	newph.add(max);
//	System.out.println(newph);	
	
	
}
}
