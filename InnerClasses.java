
// outside classes can not be static // but inner classes can be static

import java.util.Arrays;

public class InnerClasses { // outer class 
    // Static inner class
   static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
        public static void main(String[] args) {
            Test a = new Test("Hello");
            Test b = new Test("World");
            Arrays.toString(new int[]{1, 2, 3});
            System.out.println(a.name + " " + b.name);

        }


    }
    
}
// the test and main are // static inner class and main method respectively. and they can depend on each other.
//  not depending on the outer class.