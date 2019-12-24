package oops;

public class Stringbufferdemo {
	
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("jay");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //default(16)+ initial (3)
		
		sb.append("mehta");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
	}

}
