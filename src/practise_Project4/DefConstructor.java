package practise_Project4;

public class DefConstructor {
    int sum; // Declare sum as a class-level variable

    DefConstructor() {
        int a = 100;
        int b = 400;
        sum = a + b; // Assign the value to the class-level variable
        System.out.println("Value of Sum is " + sum);
    }

    public static void main(String[] args) {
        // DefConstructor obj = new DefConstructor();
        new DefConstructor(); //Creating an instance without assigning to a variable
    }
}
