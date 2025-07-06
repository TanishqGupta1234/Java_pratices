package PolyMorphism;

public class Numbers {
    int sum(int a, int b)
    {
        return a + b;
    }
    int sum(int a, int b, int c)
    {
        return a + b + c;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(3, 2); // determination to run which methods will run is at compiler time only
        obj.sum(3, 4, 5);

    }
    
}
