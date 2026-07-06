public class Book {
    String Title;
    String author;
    int price;
    Book(String Title){
        this.Title=Title;
    }   
    Book(String Title, String author){
        this.Title=Title;
        this.author=author;
    }   
    Book(int Price){
        this.author=author;
    }   
    Book(String Title,String author,int price){
        this.Title=Title;
        this.author=author;
        this.author=author;
    }   
}


class Day10C {
    public static void main(String[] args) {
        Book b1 = new Book(500);
    Book b2 = new Book("java");
    Book b3 = new Book("java","surya",500);
    Book b4 = new Book("java","surya");

    }
    
}
