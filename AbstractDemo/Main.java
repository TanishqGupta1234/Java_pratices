package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        // Creating a Daughter object to access abstract method implementation
        Daughter daughter = new Daughter();

        // Calling the 'career' method defined in Daughter class
        daughter.career();

        // If you want to use Son class instead, you can uncomment the following lines:
        // Son son = new Son();
        // son.career();
    }
}


    

//An abstract class in Java is a class that cannot be directly used to create objects. It is like a blueprint for other classes.
// Cannot create objects of abstract classes.
// Can have abstract methods (methods without a body).
// Can have normal methods with body too!
// Must be extended (inherited) by other classes.

// An abstract class in Java is a class that cannot be instantiated (you can't create objects of it) and is meant to be inherited by other classes.
// It acts like a blueprint for other classes to follow.