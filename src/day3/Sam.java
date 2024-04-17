package day3;

public class Sam {
		public static void main (String [] args) {
			String a = "happy";
			String b = a.toUpperCase();
			System.out.println(b);
		
				String c = b.toLowerCase();
					System.out.println(c);
					
					int d = a.length();
					System.out.println(d);
					
					String e = "day";
					String f = a.concat(e);
					System.out.println(f);
					
					boolean g = e.contains("a");
					System.out.println(f);
					
					boolean h = a.startsWith("h");
					System.out.println(h);
					
					boolean i = a.endsWith("h");
					System.out.println(i);
					
					String j = "happy"; 
					boolean	k = a.equals(j);
					System.out.println(h);
					
					boolean l = a.equalsIgnoreCase(j);
					System.out.println(l);
					
					int m = a.indexOf("y");
					System.out.println(m);
					
					char o = a.charAt(2);
					System.out.println(o);
					
					String p = "Ariyalur";
					char  q = p.charAt(p.length()-1);
					System.out.println(q);
					
					char  r = p.charAt(p.length()/2);
					System.out.println(r);
					
					String s = p.substring(0,6);
					System.out.println(s);
					
					String t = "Language";
					char[] u = t.toCharArray();
					System.out.println(u[6]);
					
					String v = "abi,abi,a";
					String[] w = v.split(",");
					System.out.println(w[2]);
					
					
					
		}
}
