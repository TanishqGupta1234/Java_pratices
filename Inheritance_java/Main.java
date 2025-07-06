package Inheritance_java;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box();
        // System.out.println("Box dimensions: " + box.h + " x " + box.w + " x " + box.l);
        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,5);
        // System.out.println(box3.h + " " + box3.w + " " + box3.l + " " + box3.weight);
        // there are many variables in parents and child classes
        // you are given access to variables that are present in ref type
        // Box box5 = new BoxWeight(2,3, 0, 7);
        //  System.out.println(box5.h + " " + box5.w + " " + box5.l);
        // BoxWeight box6 = new Box(2,3,4);
//         You're trying to assign a parent class object (Box) to a child class reference (BoxWeight).
// This is not allowed in Java because the parent class doesn't have the extra properties or methods defined in the child class.


BoxPrice box = new BoxPrice(5, 8, 200);
 




    }
    
}
//Box → Reference (the type of variable)
// new BoxWeight(...) → Object (the thing you created in memory)
// So box5 is a Box reference pointing to a BoxWeight object
