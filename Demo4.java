package exceptiondemos;

public class Demo4 {
	
	public void display1() throws InterruptedException 
	{
		System.out.println("welcome in display");		
		Thread.sleep(1000);
		System.out.println("bye");
		
	}
	public void display2() throws InterruptedException 
	{
		System.out.println("welcome in display");		
		Thread.sleep(1000);
		System.out.println("bye");
		
	}
	public static void main(String[] args) throws Exception {
		System.out.println("main started");
		Demo4 d= new Demo4();
		d.display1();
		d.display2();
		System.out.println("main ended");
	}
}