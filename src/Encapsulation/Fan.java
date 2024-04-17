package Encapsulation;

public class Fan {
private String brand;
private int noOfWings;
private Coil coil;

public void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setNoOfWings(int noOfwings) {
	this.noOfWings=noOfWings;
}
public int getNoOfWings() {
	return noOfWings;
}
public void setCoil(Coil c) {
	coil=c;
}
public Coil getCoil() {
	return coil;
}
	
	public Fan(String brand,int noOfWings,Coil col) {
		this.brand = brand;
		this.noOfWings = noOfWings;
		coil = col;
	}	
		public String toString() {
			return "Brand="+brand+"NoOfWings="+noOfWings+","+coil;
		}
}

