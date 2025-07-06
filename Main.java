public class Main {
    public static void main(String[] args) {
        // A class is a template for creating objects
        // An object is an instance of a class

        Student kunal = new Student();
        kunal.rno = 1;
        kunal.name = "Kunal";
        kunal.marks = 90.5f;

        // You can also create an array of students if needed
        // Student[] students = new Student[5];
    //     System.out.println(kunal.rno);
    //     System.out.println(kunal.name);
    //     System.out.println(kunal.marks);
    //     kunal.changeName("Kunal Singh");
    //     kunal.greeting();
    //    Student random = new Student();
    //    System.out.println(random.name);
    //    Student random2 = new Student();
    //    System.out.println(random2.name);
       Student one = new Student();
       Student two = one; // both one and two point to the same object
       one.name  = "Tanishq";
       System.out.println(two.name); // this will print "Tanishq" because both one and two point to the same object


    }
}

// Define Student class outside the main method (still inside the same file)
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the value of the above 
    // properties object by object
    // we need one word to access Object properties

    void greeting()
    {
        System.out.println("Hello, my name is " +this.name);
    }
    
    void changeName(String newName)
    {
        name = newName;

    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
        // this is a copy constructor
    }


    Student (){
        // // constructor is a special method that is called when an object is created
        // this.rno = 0; // default value
        // this.name = "tanishq";
        // this.marks = 56.0f; // default value
        // this is how you call a constructor from another constructor
        // this (rno:13, "Tanishq", 56.0f);

    }
}

// constructor is a special method that is called when an object is created

// primtive data types are stored in memory directly
// reference data types are stored in memory as a reference to the object
// reference data types are objects, arrays, strings, etc.
// primitive data types are int, float, double, char, boolean, etc.
// reference data types are stored in heap memory
// primitive data types are stored in stack memory