package Practise_Project7;

public class Outer {
    private int a = 100;
	class Inner{
		public void display() {
			System.out.println("This is inner class. and we are accessing the private value outside of the class");
			System.out.println("The value of a is "+ a);
		}
	}
}
