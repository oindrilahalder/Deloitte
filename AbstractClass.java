package inheritance;

abstract class AbstractClass { //can have cons 
	//but it will invoke when child obj is created
	public abstract void eat();
	public void sleep() {
		System.out.println("animal sleeps");
	}
	public static void main(String[] args) {
		AbstractClass a=new Dogs();
		a.eat();
		a=new Cats();
		a.eat();
	}	
}
class Dogs extends AbstractClass
{
	@Override
	public void eat()
	{
		System.out.println("Dog eats meat");
	}
}
class Cats extends AbstractClass
{
	@Override
	public void eat()
	{
		System.out.println("Cat drinks milk");
	}
}

