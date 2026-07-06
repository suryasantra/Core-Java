import java.util.Vector;

public class VectorSearchingElements {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(50);
        v.add(20);
        v.add(60);
        v.add(40);
        System.out.println(v.contains(60)); 
       System.out.println( v.indexOf(20));
    }
}
