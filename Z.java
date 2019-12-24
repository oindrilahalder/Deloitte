package oops;

public class Z {
	W w =new W();
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
		
	}
	public Z() {
		System.out.println("Z cons");
	}
	public static void main(String[] args) {
	System.out.println("Main called");
	new Z();
	new Z();
	}

}
