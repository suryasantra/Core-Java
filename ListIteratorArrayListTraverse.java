import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorArrayListTraverse {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
            a.add(10);
            a.add(20);
            a.add(30);
            a.add(96);
        
        ListIterator li = a.listIterator(a.size());
        while (li.hasPrevious()) {
            System.out.print(li.previous()+" ");

        System.out.println();
        

        for(int i=0;i<a.size();i++ )
            System.out.print(a.get(i)+" ");


        System.out.println();

        for(int i=a.size()-1;i>=0;i-- )
            System.out.print(a.get(i)+" ");
        }
    }

}