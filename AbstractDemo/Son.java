package AbstractDemo;

// 'Son' is a subclass of the abstract class 'Parent'
// It must override all abstract methods of Parent
public class Son extends Parent {

    // Constructor to set the age (inherited from Parent)
    public Son(int age) {
        this.age = age;  // 'age' is inherited from Parent class
    }

    // Overriding the abstract method 'career' from Parent
    @Override
    void career() {
        System.out.println("I am going to be a doctor");  // Specific career for Son
    }

    // Overriding the abstract method 'partner' from Parent
    @Override
    void partner() {
        System.out.println("I love Ananya");  // Specific partner choice for Son
    }
}
