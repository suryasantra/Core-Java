import java.util.ArrayList;

public class RemovingElements {
     public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(3);
        System.out.println(a);
        System.out.println(a.remove((Integer)30));
        System.out.println(a.remove(3));
        System.out.println("-------------------------------------------------------------------");
        ArrayList<String> s= new ArrayList<>();
        s.add("Ahana");
        s.add("Surya");
        s.add("Shayandip");
        s.add("Rajnish");
        s.add("Tarun");
        System.out.println(s);
        System.out.println(s.remove("Rajnish"));
        System.out.println(s.remove(3));
     }
}
