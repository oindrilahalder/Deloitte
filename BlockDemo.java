package oops;

public class BlockDemo {
	{
System.out.println("Deloitte");
}
static {
	System.out.println("Static Block called");
}
public BlockDemo() {
	System.out.println("cons called");
}
public static void main(String[] args) {
	System.out.println("main called");
	BlockDemo demo= new BlockDemo();
}
}