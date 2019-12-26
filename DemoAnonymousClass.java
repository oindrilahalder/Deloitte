package inheritance;

interface ChangePasswords
{
	void doChange();
}
	
public class DemoAnonymousClass {
	public static void main(String[] args) {
		ChangePasswords pa = new ChangePasswords()
		{
			@Override
			public void doChange() {
				System.out.println("pass changed");
			}
		};
		pa.doChange();
	}
}
