package architect_100_remote;

public class Class3 extends Base{

	static{
		System.out.println("Derived static block");
	}{
		System.out.println("Derived instance block");
	}
	public Class3(){
		System.out.println("Derived constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		Class3 c = new Class3();
	}
}

class Base{
	static{
		System.out.println("Base static block");
	}{
		System.out.println("Base instance block");
	}
	public Base(){
		System.out.println("Base constructor");
	}
}