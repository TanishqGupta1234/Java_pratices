package Inheritance_java;

public class Box {
    double h; // private means // these variables are not accessible outside this class
    double w;
    double l;

    Box()
    {
        this.h = 1;
        this.w = 1;
        this.l = 1;
    }
    // square 
    Box (double side)
    {
     //   super(); // calls the constructor of the parent class
        this.h = side;
        this.w = side;
        this.l = side;
    }
    Box(double h, double w, double l)
    {
        this.h = h;
        this.w = w;
        this.l = l;
    }
    Box(Box old)
    {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    public void information()
    {
        System.out.println("running the box");

    }

    
}
