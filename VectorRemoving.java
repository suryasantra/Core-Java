import java.util.Vector;

public class VectorRemoving {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(50);
        v.add(20);
        v.add(60);
        v.add(40);
        System.out.println(v);
        System.out.println(v.remove((Integer)60)); 
         System.out.println(v);
        System.out.println( v.remove(0));
         System.out.println(v);
    }
}
