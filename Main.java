import java.util.ArrayList;

public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {Author a2 = new Author("John Pork");
      Author a1 = new Author("Joen Smork");
      Book b2 = new Book("10 ways to bake Bacon",a1);
      Book b = new Book("unethical eating habits", a2); 
      Movie m = new Movie(13.0);
      ArrayList<ItemForSale> items = new ArrayList<>();
      items.add(b2);
      items.add(b);
      
        Store s = new Store(items, 23.30);
        s.addItem(m);
        System.out.println(s.showItems());
        s.sellItem(b2);
        System.out.println(s.showItems());
        System.out.println((b instanceof ItemForSale) + ", " + b.creatorName());
     }
}
