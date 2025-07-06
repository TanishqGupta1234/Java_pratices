package Inheritance_java;

public class BoxPrice extends BoxWeight{

    double cost;
    BoxPrice()
    {
        super();
        this.cost = -1;
    }
    BoxPrice(BoxPrice other)
    {
        super(other);   // Call the constructor of the parent class BoxWeight
        this.cost = other.cost;

    }
    public BoxPrice(double h, double w, double l, double weight, double cost) {
        super(h, w, l, weight); // Call the constructor of the parent class BoxWeight
        this.cost = cost;
    }
    public BoxPrice(double side, double weight, double cost) {
        super(side, weight); // Call the constructor of the parent class BoxWeight
        this.cost = cost;
    }
}

