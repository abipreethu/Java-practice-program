package day3;

public class UseBag {
public static void main(String [] args) {
	Bag bag1 = new Bag();
	bag1.brand = "xx";
	bag1.color = "black";
	bag1.length = 3.4f;
	bag1.price = 500;
			
	Bag bag2 = new Bag();
	bag2.brand = "yy";
	bag2.color = "blue";
	bag2.length = 3.5f;
	bag2.price = 600;
	
	System.out.println(bag1.brand+"\n"+bag1.color+"\n"+bag1.length+"\n"+bag1.price);
	System.out.println(bag2.brand+" "+bag2.color+" "+bag2.length+" "+bag2.price);
}
}
