import java.util.ArrayList;

public class RemoveCustomObject {
    public static void main(String[] args) {
    ArrayList<Remote1> a = new ArrayList();
        a.add(new Remote1(350, "Sony"));
        a.add(new Remote1(250, "LG"));
        a.add(new Remote1(450, "Philips"));
        a.add(new Remote1(50, "local"));


        System.out.println(a);
        System.out.println(a.remove(new Remote1(450, "Philips")));
        System.out.println(a);
        System.out.println(a.remove(0));
        System.out.println(a);
    }


}
