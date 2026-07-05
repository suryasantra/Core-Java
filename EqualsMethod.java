

public class EqualsMethod {
    public static void main(String[] args) {
        Book b1 = new Book("Java", 123);
        Book b2 = new Book("Java", 123);
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b1);
    }
}

class Book {
    int price;
    String title;
    Book(String title,int price){
        this.title=title;
        this.price=price;
    }
    @Override
    
    // equals override
    public boolean equals(Object o){
        Book b=(Book)o;
        return b.price==this.price&& b.title.equals(this.title);
    }

    //hashcode override
    public int hashCode(){
        return ((Integer)price).hashCode()+title.hashCode();
    }

    // toString Method
    public String toString(){
        return "Title:"+title+", Price:"+price;
    }
    
}
