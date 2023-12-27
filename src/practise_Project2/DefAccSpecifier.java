package practise_Project2;

class AccessSpecifier {
	
	//show method with default access specifier
	void show() {
		System.out.println("This is the Default Access Specifier Method");
	}
}
public class DefAccSpecifier{
	public static void main(String[] args) {
		System.out.println("Accessing default method from another class");
		AccessSpecifier obj = new AccessSpecifier();
		obj.show();
		
		
	}

}