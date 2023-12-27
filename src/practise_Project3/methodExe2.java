package practise_Project3;

public class methodExe2 {
    public void sum(int a,int b) {
		System.out.println("Sum of two nos is "+(a+b));
	}
	public void sum(double x,double y) {
		System.out.println("The sum of two double value is "+(x+y));
	}
	
	public static void main(String[] args) {
		methodExe2 obj =new methodExe2();
		obj.sum(100,700);
		obj.sum(10.5,200.2);
		

	}
}
