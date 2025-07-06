package PolyMorphism;

public class Circle extends Shapes{

    // this will run when obj of Circle is created
    // Hence it is overriding the parent methods
    // @override // this is called annotation
    void area()
    {
        System.out.println("Area is pi * r * r");
    }


    
}
