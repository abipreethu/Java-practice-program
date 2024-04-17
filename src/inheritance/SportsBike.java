package inheritance;

public class SportsBike extends Bike {
	float weight;
	int speed;
	
	public String findMileage(int speed) {
		if(speed>=0&&speed<=30) {
			return "Mileage="+40;
		}
		else if(speed<=50&&speed>30) {
			return "Mileage="+25;
		}
		else {
			return "Mileage="+15;
		}
	}

}
