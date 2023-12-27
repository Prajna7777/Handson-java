package practise_Project3;

public class methodExe {
    int method(int value) {
		value= value+10;
		return value;
	}

	public static void main(String args[]) {
		methodExe obj = new methodExe();
		int v=obj.method(100);
		//System.out.println("Value is: "+obj.value);
		System.out.println(v);
	}
    
}
