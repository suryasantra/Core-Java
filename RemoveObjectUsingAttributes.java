import java.util.ArrayList;

public class RemoveObjectUsingAttributes {
    public static void main(String[] args) {
    ArrayList<Remote1> a = new ArrayList();
        a.add(new Remote1(350, "Sony"));
        a.add(new Remote1(250, "LG"));
        a.add(new Remote1(450, "Philips"));
        a.add(new Remote1(50, "local"));

     
        System.out.println(a);
        int key = 250;
        Remote1 toBeRemoved = null;
        for (Remote1 r: a) {
            if (r.price==key) {
                toBeRemoved=r;
            }
        }
        if (toBeRemoved!=null) {
            a.remove(toBeRemoved);
        }
        System.out.println(a);
    }
}
