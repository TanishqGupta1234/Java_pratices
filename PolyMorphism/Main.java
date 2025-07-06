package PolyMorphism;


public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Sqaure square = new Sqaure();
        shape.area();
        
    }
    
}
//polymorphism means "many forms". It allows methods to do 
//different things based on the object it is acting upon, even if they share the same name. 
//In this example, the `area` method in the `Shapes` class can be overridden by subclasses 
//like `Circle`, `Sqaure`, and `Triangle`, allowing each shape to define its own area calculation while still being treated as a `Shapes` object. 
//This is a key feature of object-oriented programming that promotes code reusability and flexibility.