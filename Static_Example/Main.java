package Static_Example;

import Pratice_javas.greetings;

public class Main {
    public static void main(String[] args) {
        // Human human1 = new Human(25, "Alice", 50000, false, 0);
        // Human human2 = new Human(30, "Bob", 60000, true, 0);
        // Human human3 = new Human(28, "Charlie", 55000, true, 0);
        // Human human4 = new Human(22, "Diana", 45000, false, 0);
        // System.out.println(Human.population); // Accessing the static variable population through an instance
        // System.out.println(Human.population); // Accessing the static variable population through another instance
        // System.out.println(Human.population); // Accessing the static variable population through yet another instance
        // System.out.println(Human.population); // Accessing the static variable population through a different instance

        // // The static variable population is shared among all instances of the Human class.
        // System.out.println(human1.population); // This line is incorrect as it tries to access a static variable through an instance
        // Static varaibles are shared among all instances of a class, so you can access them directly through the class name.
        // Static means the variable belongs to the class itself, not to any specific instance of the class.
      //  We write static here so that Java can run this method without creating an object of the class.
        // greeting(); // Calling the static method greeting directly without creating an instance of the class


    }
// this will create an error because greeting is not static
    static void fun()
    {
        System.out.println("hello world");
        // greetings(); // you cant call a non-static method from a static context without an instance of the class.
        //  but the function you are using it in does not depend on instances

        // you can not call a non-static method from a static context without an instance of the class.
        Main obj = new Main();
        obj.greeting(); // You can call a non-static method using an instance of the class.
    } 

    // we know which is not static belongs to ab object..
    void greeting()
    {
        System.out.println("hello world");
    }
    
}

// use cannot use this method inside static method because this represents the current instance of the class, and static methods do not have an instance associated with them.
    // void greeting()
    // {
    //     System.out.println("hello world");
    // }