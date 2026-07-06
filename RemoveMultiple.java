import java.util.ArrayList;

public class RemoveMultiple {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);

        ArrayList a2 = new ArrayList();
        a2.add(40);
        a2.add(50);
        a2.add(60);
        a2.add(10);


        a.retainAll(a2);
        System.out.println(a);

        a.removeAll(a2);
        System.out.println(a);
        
        a.clear();
        System.out.println(a);
    }
}
