import java.util.Vector;

public class VectorTraversing {
     public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(50);
        v.add(20);
        v.add(60);
        v.add(40);
        for (Object obj : v) {
             System.out.println(obj);
        }
       
    }
}
