package collection1;

import java.util.ArrayList;

public class New {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(2);
		num.add(9);
		num.add(10);
		
		for(int i=0;i<num.size();i++) {
//			System.out.println(num.get(i));
		}
		for(int i=0;i<num.size();i++) {
			if(num.get(i)%2!=0) {
//				System.out.println(num.get(i));
			}
		}
			num.remove(2);
			for(int i=0;i<num.size();i++) {
				System.out.println(num.get(i));
			}
		}
	}


