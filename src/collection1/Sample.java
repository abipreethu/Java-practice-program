package collection1;
import java.util.ArrayList;
public class Sample {
public static void main(String[] args) {
	ArrayList <String> vals = new ArrayList<>();
	vals.add("appl");
	vals.add("abi");
	vals.add("mon");
	
	vals.add("dad");
	
//	for(int i=0;i<vals.size();i++) {
//		System.out.println(vals.get(i));
//	}
//	for(int i=0;i<vals.size();i++) {
//		if(vals.get(i).startsWith("a")) {
//			System.out.println(vals.get(i));
//		}
//	}
	
	
	for(String a: vals) {
		System.out.println(a);
		}
	
	vals.forEach(x->{
		if(x.length()%2==0) {
		System.out.println(x);	
		}
	});
}
}
