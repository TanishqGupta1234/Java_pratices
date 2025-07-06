package AbstractDemo;

// 'Daughter' is a subclass of the abstract class 'Parent'
// It must override all abstract methods declared in the Parent class
public class Daughter extends Parent {

    // Overriding the abstract method 'career' from Parent class
    @Override
    void career() {
        System.out.println("I am going to be a teacher");  // You can customize this message
    }

    // Overriding the abstract method 'partner' from Parent class
    @Override
    void partner() {
        System.out.println("I love Arjun");  // You can customize this name
    } 
}
