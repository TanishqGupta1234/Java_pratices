package Inheritance_java;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;

    }

    BoxWeight(BoxWeight other)
    {
        super(other);   // Call the constructor of the parent class Box
        weight = other.weight;

    }
    BoxWeight(double side, double weight)
    {
        super(side); // Call the constructor of the parent class Box
        this.weight = weight;
    }

    public BoxWeight(double h, double w, double l, double weight) {
        super(h, w, l); // Call the constructor of the parent class Box
        // used to initialize the values present in parent class
        // if we have the same property in both classes , then by using super we can access the parent class property 
        // and by using this we can access the child class property
        this.weight = weight;
    }


}
// what thing is accessed is based on the type of reference variable not on // the type of object