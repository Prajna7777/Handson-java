package practise_Project3;

public class volumeOfBoxMain {
    public static void main(String[] args) {
		volumeOfBox obj = new volumeOfBox();
		//calling the method from another class
		double volume = obj.display(30,10,20);
		System.out.println("Volume of box is "+volume);

	}
}
