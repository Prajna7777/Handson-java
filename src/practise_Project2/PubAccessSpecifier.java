package practise_Project2;

 class PAccessSpecifier {
    public void show (){
        System.out.println("This is a public method");
    }
}
    public class PubAccessSpecifier {
        public static void main (String[] args){
            System.out.println ("Going to Access the public method from another class");
            PAccessSpecifier obj = new PAccessSpecifier();
            obj.show();
        }
    }
