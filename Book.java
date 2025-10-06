
public class Book extends ItemForSale
{
    public String publisher;
    public Author auth;

    public Book(String p, Author a){
        super(null, null, null, null);
        publisher = p;
        auth = a;
    }

}
