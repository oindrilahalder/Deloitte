package oops;



public class Exercise_string {
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		
		
		System.out.println(s.charAt(12));
		
		System.out.println(s.contains("is"));
		
		s=s.concat(" and killed it");
		System.out.println(s);
		
		System.out.println(s.endsWith("dogs"));
		
		System.out.println(s.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.println("length of the String:"+ s.length());
		
		System.out.println(s.matches("The quick brown Fox jumps over the lazy Dog"));
		
		s=s.replace("The", "A");
		System.out.println(s);
		
		
		int len=s.length();
		int mid= (len+1)/2;
		String s1=s.substring(0, mid);
		String s2=s.substring(mid+1, len);
		
	
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		System.out.println(s.split("fox", 2));
		
		
		String animal1=s.substring(14, 17);
		String animal2=s.substring(38, 41);
		System.out.println(animal1);
		System.out.println(animal2);
		
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println();
		
		int index1= s.indexOf("a");
		System.out.println("index of a:"+index1);
		
		int index2=s.lastIndexOf("e");
		System.out.println("last index:"+ index2);
		
	
		
	}
	

			

			}


