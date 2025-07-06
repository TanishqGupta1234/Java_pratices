package Static_Example;


// demo to show initization of static variables and methods in Java
public class StaticInt {
    static int a =4;
    static int b;

    static {
        System.out.println("I am in a Static Block");
        b = a * 5; // Initializing static variable b using static variable a
    }
    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b); // Accessing static variables using the class name
    }


    
}
