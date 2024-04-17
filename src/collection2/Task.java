package collection2;
import java.util.HashMap;
public class Task {
	public static void main(String[] args) {
HashMap<Integer,String> details = new HashMap<>();
details.put(1,"ravi");
details.put(2,"vinoth");
details.put(3,"soundarya");
details.put(4,"guru");
details.put(5,"abi");
details.put(3,"elakkiya");
System.out.println(details);
System.out.println(details.keySet());
System.out.println(details.values());
details.remove(2);
System.out.println(details.get(3));

	for(Integer a : details.keySet()) {
		System.out.println(a);
	}
	for(String a : details.values()) {
		System.out.println(a);
	}
	for(Integer a : details.keySet()) {
		System.out.println(details.get(a));
	}	
	for(Integer a : details.keySet()) {
		System.out.println(a+"="+details.get(a));
	}
	
	details.keySet().forEach(a->System.out.println(a));
details.values().forEach(a->System.out.println(a));
details.keySet().forEach(a->System.out.println(a+"="+details.get(a)));
details.forEach((a,b)->System.out.println(a+"="+b));

for(Integer a : details.keySet()) {
	if(details.get(a).endsWith("i")) {
		System.out.println(details.get(a));
	}
}
		
		details.keySet().forEach(x->{
			if(details.get(x).length()%2==0) {
				System.out.println(x+"="+details.get(x));
			}
		});
		details.forEach((x,y)->{
			if(y.length()%2!=0) {
				System.out.println(x+"="+y);
			}
		});
		String max = details.get(1);
		for(Integer a : details.keySet())  {
			if(details.get(a).length()>max.length()) {
				max=details.get(a);
			}
		}
		System.out.println(max);
			}
		}
	

