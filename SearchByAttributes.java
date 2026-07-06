import java.util.ArrayList;

public class SearchByAttributes {
   public static void main(String[] args) {
    ArrayList<Remote1> a = new ArrayList();
        a.add(new Remote1(350, "Sony"));
        a.add(new Remote1(250, "LG"));
        a.add(new Remote1(450, "Philips"));
        a.add(new Remote1(50, "local"));

        boolean isFound=false;
        int key = 300;
        for (Remote1 r: a) {
        if (r.price==key) {
            isFound=true;
            break;
        }
            
        }
        if (isFound) {
            System.out.println("found");
        }
        else
            System.out.println("Not Found");
   } 
}
