import java.util.ArrayList;
// import java.util.Iterator;

class ArrayListTraverse{
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(96);

        // Iterator i = a.iterator();
        // while (i.hasNext()) {
        //     System.out.print(i.next()+" ");
        // }

        //Forward Traversal

        for(int i=0;i<a.size();i++ )
            System.out.print(a.get(i)+" ");


        System.out.println();

          //Forward Traversal

        for(int i=a.size()-1;i>=0;i-- )
            System.out.print(a.get(i)+" ");
System.out.println();
        for (Object e:a)
            System.out.print(e+" ");
    }
}