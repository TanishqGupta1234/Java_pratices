package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); 
        List<Integer> list2 = new LinkedList<>(); 

        list2.add(43);
        list2.add(34);
        list2.add(32);
        list2.add(21);

        System.out.println(list2);

        List<Integer> vectors = new Vector<>();
        vectors.add(34);
        vectors.add(312);
        vectors.add(75);
        System.out.println(vectors);


        

    }
    
}
