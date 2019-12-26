package inheritance;

class ChangePassword //outer class
{
	class EncryptPassword //inner class(can be static/private)
									//can be accessed inside the main class
	{
		String password="pass@123";
		int passwordLevel=5;
		public void doEncrypt() {
			System.out.println("the pass is: "+password);
		}
	}
}
public class DemoInnerClass {
	public static void main(String[] args) {
		ChangePassword pa = new ChangePassword(); //create obj of outer class
		ChangePassword.EncryptPassword e = pa.new EncryptPassword(); 
										//create obj of inner class using obj of outer class
		e.doEncrypt();
	}
}
