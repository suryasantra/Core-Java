import java.util.Arrays;
import java.util.Comparator;
public class ComparableWithComparetor {
    public static void main(String[] args) {
        Book b1 = new Book(900,"Java");
        Book b2 = new Book(600,"SQL");
        System.out.println(b1.compareTo(b2));
        PriceCom p = new PriceCom();
        System.out.println(p.compare(b1,b2));
        // Book array[] = new Book[5];
        Book array[]= {new Book(1000, "java"), new Book(200, "SQL")};
        Arrays.sort(array,new PriceCom());
        System.out.println(array[0].price);
        
    }
}

class Book implements Comparable <Book>{
    int price;
    String title;
    Book(int price, String title){
        this.title = title;
        this.price = price;
    }

    public int compareTo(Book b){
        return this.title.compareTo(b.title);
        // return this.price - b.price ;
    }

}
class PriceCom implements Comparator<Book>{
    public int compare(Book b1,Book b2){
        return b2.price - b1.price;
    }
}


