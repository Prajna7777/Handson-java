package Practise_Project7;

public class Inner {
    public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.display();
	}
}
