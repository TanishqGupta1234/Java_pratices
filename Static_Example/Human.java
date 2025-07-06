package Static_Example;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;
   public Human(int age, String name, int salary, boolean isMarried, long population) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1 ; // Assigning the static variable population
        // this.population += 1; // This line is incorrect as it tries to modify a static variable in the constructor

         
    }

    
}
