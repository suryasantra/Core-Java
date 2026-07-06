import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {
    public static void main(String[] args) {
        //Case 1
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(7);
        a1.add(13);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);

    
        // //Case 2
        // ArrayList a2 = new ArrayList<>();
        // a2.add(20);
        // a2.add(9);
        // a2.add("Tiger");
        // System.out.println(a2);
        // Collections.sort(a2);
        // System.out.println(a2);

        ArrayList a3 = new ArrayList<>();
        a3.add("Rat");
        a3.add("Cow");
        a3.add("Tiger");
        System.out.println(a3);
        Collections.sort(a3);
        System.out.println(a3);



    }
}
