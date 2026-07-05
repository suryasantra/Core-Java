import java.util.Vector;
import java.util.Collections;
public class VectorSorting {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(50);
        v.add(20);
        v.add(60);
        v.add(40);
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);
    }
}
