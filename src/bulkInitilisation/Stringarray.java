package bulkInitilisation;

public class Stringarray {
	public static void main(String[] args) {
		String[] name = {"sam","ram","suni","moos","fly","sky"};
		int count = 0;
		String max = name[0];
		//find even string
		for(int i=0;i<name.length;i++) {
			if(name[i].length()%2==0) {
				//System.out.println(name[i]);
			}
		}
			
		//find starts s and ends i
			for(int i=0;i<name.length;i++) {
				if(name[i].startsWith("s")&&name[i].endsWith("i")) {
					//System.out.println(name[i]);
				}
			}
			
			//find vowel string
			for(int i=0;i<name.length;i++) {
				if(name[i].contains("a")||name[i].contains("e")||name[i].contains("i")||name[i].contains("o")||name[i].contains("u")) {
					System.out.println(name[i]);
				}
				else {
					count++;
				}
			}
			System.out.println(count);
			
			for(int i=0;i<name.length;i++) {
				if(name[i].length()>max.length()) {
					max = name[i];
				}
			}
			
			System.out.println(max);
		}
	}

