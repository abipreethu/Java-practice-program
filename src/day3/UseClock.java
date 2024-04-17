package day3;

public class UseClock {
public static void main(String[] args){
String[] abi = args[0].split(",");
	Clock clock = new Clock();
	clock.brand = abi[0];
	clock.shape = abi[1];
	clock.color = abi[2];
	clock.price = Integer.parseInt(abi[3]);
	System.out.println(clock.brand+" "+clock.shape+" "+clock.color+" "+clock.price);
}
}
