package oops;

public class Calculator {

	
		public void add(int a, int b) {
			System.out.println(a+b);
			
		}
public void add(double a, double b) {
	System.out.println(a+b);
		}

public void add(int a, double b) {
	System.out.println(a+b);
}

public void add(double a, int b) {
	System.out.println(a+b);
}

public void diff(int a, int b) {
	System.out.println(a-b);
}

public void diff(double a, double b) {
	System.out.println(a-b);
		}
public void diff(int a, double b) {
	System.out.println(a-b);
}

public void diff(double a, int b) {
	System.out.println(a-b);
}

public void mul(int a, int b) {
	System.out.println(a*b);
}
public void mul(double a, double b) {
	System.out.println(a*b);
}

public void mul(int a, double b) {
	System.out.println(a*b);
}

public void mul(double a, int b) {
	System.out.println(a/b);
}

public void div(int a, int b) {
	System.out.println(a/b);
}
public void div(double a, double b) {
	System.out.println(a/b);
}

public void div(int a, double b) {
	System.out.println(a/b);
}

public void div(double a, int b) {
	System.out.println(a/b);
}
	
public static void main(String[] args) {
	Calculator calci=new Calculator();
	calci.add(1, 2);
	calci.add(1.5, 2.5);
	calci.add(1,2.5);
	calci.add(1.5, 2);
	
	calci.diff(1, 2);
	calci.diff(1.5, 2.5);
	calci.diff(1,2.5);
	calci.diff(1.5, 2);
	
	calci.mul(1, 2);
	calci.mul(1.5, 2.5);
	calci.mul(1,2.5);
	calci.mul(1.5, 2);
	
	calci.div(1, 2);
	calci.div(1.5, 2.5);
	calci.div(1,2.5);
	calci.div(1.5, 2);
}
	
	
}
