import java.util.ArrayList;

public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

    public static void main(String[] args){
    // Author
    Author author1 = new Author("george", "2/2/1232");
    System.out.println("Author1 name: " + author1.getName());
    System.out.println("Author1 birth date: " + author1.getdate());

    // Book
    Book book1 = new Book("feminist literature", author1);
    System.out.println("Book1 name: " + book1.getName());
    System.out.println("Book1 author: " + book1.getAuthor().getName());
    book1.setPublisher("john pork");
    System.out.println("Book1 publisher: " + book1.getPublisher());

    // Movie
    Movie movie1 = new Movie(120.0);
    System.out.println("Movie1 duration: " + movie1.getDuration());

    // ItemForSale
    ItemForSale item = new ItemForSale("labubu", "la baba", 5.0, "6/9/2067");
    System.out.println("Item name: " + item.getName());
    System.out.println("Item creator: " + item.getCreator());
    System.out.println("Item price: " + item.getPrice());
    System.out.println("Item date: " + item.getDateOfSale());

    // Store
    ArrayList<ItemForSale> items = new ArrayList<>();
    items.add(book1);
    items.add(movie1);
    Store store = new Store(items, 0.0);
    System.out.println("Initial store items: " + store.showItems());
    store.sellItem(book1);
    System.out.println("After selling book1: " + store.showItems());
    System.out.println("Store profit after sale: " + store.getProfit());
    }
}
