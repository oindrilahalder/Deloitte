package inheritance;

public class Animal {
	public void eat() {
		System.out.println("animal eats");
	}
	public void sleep() {
		System.out.println("animal sleeps");
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
	}
}
class Dog extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Dog eats meat");
	}
	
}
class Cat extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Cat drinks milk");
	}
}