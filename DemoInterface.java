package inheritance;

abstract class A
{
	//interface cant inherit abs class but abs can inherit interface
}
interface Radio //cant have constructer
{
	int frequency=90; //by deafault its final/static
	void start(); //by default its abstract
}
interface MordernRadio extends Radio //interface can inherit interface
{
	void addBoster();
}
class MusicPlayer implements MordernRadio,Radio //multiple inheritance
{

	@Override
	public void start() {
		System.out.println("radio started");
		
	}

	@Override
	public void addBoster() {
		// TODO Auto-generated method stub
		
	}
	
}
public class DemoInterface {

	public static void main(String[] args) {

	}

}
