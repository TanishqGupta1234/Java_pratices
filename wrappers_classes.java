public class wrappers_classes {
    public static void main(String[] args) {
        int a = 10;
        // Integer b = 10; // this is a wrapper class, it wraps the primitive type int into an object
        // Integer num = 45; // this is also a wrapper class, it wraps the primitive type int into an object
        int b = 20;
        swap(a, b);// this will not swap the values of a and b in the main method
        final int bonus = 1000; // final means that the value of bonus cannot be changed
        // bonus = 2000; // this will give an error because bonus is final
        System.out.println(bonus);
        // when primitive is final you cannot change its value 
        final A kunal = new A("tanishq Gupta");// this is an object of the Student class
    }
   static void swap(int a, int b)
    {
        int temp = a;
        a =b;
        b = temp;
        // this will not swap the values of a and b in the main method
        // because a and b are passed by value, not by reference
        // in Java, primitive types are passed by value, not by reference
        // passing by value means that a copy of the value is passed to the method
        // // so any changes made to the parameters inside the method do not affect the original variables
    }

  
   static class A {
        String name;
    
        A(String name) {
            this.name = name;
        }
        @Override
        protected void finalize() throws Throwable {
            // This method is called by the garbage collector when the object is no longer reachable
            System.out.println("Object " + name + " is being garbage collected");
            // You can add any cleanup code here if needed
            // For example, closing resources or releasing memory
            // But be careful, as finalize() is not guaranteed to be called immediately
            // or at all, so it's better to use try-with-resources or explicit cleanup methods
        super.finalize();
        }
    }
    
}
//A Wrapper class in Java is like a box that wraps (covers) a primitive value (like int, char, boolean) and turns it into an object.
// Garbage Collection (GC) in Java is the process of automatically removing unused objects from memory to free up space.
// You don’t have to delete objects manually — Java does it for you! ✅

// A package is just a folder that contains Java classes. It helps organize your code and avoid name conflicts.