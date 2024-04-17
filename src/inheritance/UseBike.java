package inheritance;

public class UseBike {
	public static void main(String[] args) {
		SportsBike sb = new SportsBike();
		sb.brand = "yamaga";
		sb.price = 50000;
		sb.rating = 9.2f;
		sb.weight = 100.2f;
		sb.speed = 180;

		System.out.println("Brand=" + sb.brand + ", " + "Price=" + sb.price + ", " + "Rating=" + sb.rating + ", "
				+ "Weight=" + sb.weight + ", " + "speed=" + sb.speed + ", " + sb.findNetPrice(sb.price, 10) + ", "
				+ sb.findMileage(45));
	}
}
