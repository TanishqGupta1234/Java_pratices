package AbstractDemo;

// This is an abstract class called Parent
// You cannot create objects of abstract classes directly
public abstract class Parent {
    
    int age;  // This is a normal instance variable

    // Abstract method 'career' - no body here
    // All subclasses (like Son or Daughter) must override and define this method
    abstract void career(); 

    // Abstract method 'partner' - also must be implemented by subclasses
    abstract void partner();
}
