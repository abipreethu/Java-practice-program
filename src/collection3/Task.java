package collection3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Task {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(24);
	nums.add(6);
	nums.add(38);
	nums.add(93);
	nums.add(77);
	
	nums.stream().forEach(x->System.out.println(x));
	nums.stream().filter(x->x%2!=0).forEach(x->System.out.println(x));
	long a = nums.stream().count();
	System.out.println(a);
	List<Integer> z = nums.stream().collect(Collectors.toList());
	z.forEach(x->System.out.println(x));
}
}
