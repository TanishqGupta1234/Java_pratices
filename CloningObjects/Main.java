package CloningObjects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human tanishq = new Human(34, "tansiqh");
        // Human twin = new Human(tanishq);


        Human twin = (Human)tanishq.clone();
        System.out.println(twin.age + " " + twin.name);
    }

    
}
