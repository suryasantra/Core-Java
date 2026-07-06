import java.util.ArrayList;
import java.util.Collections;

public class CustomObjectSorting {
    public static void main(String[] args) {
        ArrayList<Remote> a= new ArrayList();
        a.add(new Remote(350, "Sony"));
        a.add(new Remote(250, "LG"));
        a.add(new Remote(450, "Philips"));
        a.add(new Remote(50, "local"));
        // System.out.println(a.contains(new Remote(50, "local")));
        // System.out.println(a.indexOf(new Remote(50, "local")));

        System.out.println(a);
        // Collections.sort(a);
       
        Collections.sort(a,new PriceComparator());
        System.out.println(a);  


        }


}
