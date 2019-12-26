package inheritance;
abstract class Animals {
	public abstract void makeNoise();
	public abstract void eat();
	public void sleep()
	{
		System.out.println("ANIMAL SLEEPS");
	}
	public abstract void roam();
	public static void main(String[] args) {
		Animals a=new Tiger();
		System.out.println("..............");
		a.roam();
		System.out.println("..............");
		a.eat();
		a.makeNoise();
		a=new Lion();
		a.eat();
		a.makeNoise();
		a=new Catt();
		a.eat();
		a.makeNoise();
		System.out.println("..............");
		a=new Dogg();
		a.roam();
		System.out.println("..............");
		a.eat();
		a.makeNoise();
		a=new Wolf();
		a.eat();
		a.makeNoise();
		System.out.println("..............");
		a=new Hippo();
		a.roam();
		a.eat();
		a.makeNoise();
		System.out.println("..............");
	}
}
abstract class Feline extends Animals
{
	@Override
	public void roam()
	{
		System.out.println("FELINE ROAMS");
	}
}
class Tiger extends Feline
{
	@Override
	public void eat()
	{
		System.out.println("TIGER EATS MEAT");
	}
	@Override
	public void makeNoise()
	{
		System.out.println("TIGER ROARS");
	}
}
class Lion extends Feline
{
	@Override
	public void eat()
	{
		System.out.println("LION EATS MEAT");
	}
	@Override
	public void makeNoise()
	{
		System.out.println("LION ROARS");
	}
}
class Catt extends Feline
{
	@Override
	public void eat()
	{
		System.out.println("CAT EATS FISH");
	}
	@Override
	public void makeNoise()
	{
		System.out.println("CAT MEOWS");
	}
}
class Hippo extends Animals
{
	@Override
	public void roam()
	{
		System.out.println("HIPPO ROAMS");
	}
	@Override
	public void eat()
	{
		System.out.println("HIPPO EATS");
	}
	@Override
	public void makeNoise()
	{
		System.out.println("HIPPO MAKES NOISE");
	}
}
abstract class Canine extends Animals //abs class inherits abs class
{
	@Override
	public void roam()
	{
		System.out.println("CANINE ROAMS");
	}
}
class Dogg extends Canine
{
	@Override
	public void eat()
	{
		System.out.println("DOG EATS PEDIGREE");
	}
	@Override
	public void makeNoise()
	{
		System.out.println("DOG BARKS");
	}
}
class Wolf extends Canine
{
	@Override
	public void eat()
	{
		System.out.println("WOLF EATS MEAT");
	}
	@Override
	public void makeNoise()
	{
		System.out.println("WOLF HOWLS");
	}
}
