

public class Book extends ItemForSale {
    private String publisher;
    private Author auth;

    public Book(String name, Author author) {
        super(name, author.getName(), 10.0, "June 7, 2067");
        this.publisher = "";
        this.auth = author;
    }

    public Book(String name, Author author, String publisher, double price, String dateOfSale) {
        super(name, author.getName(), price, dateOfSale);
        this.publisher = publisher;
        this.auth = author;
    }

        // precondition for setters and getters:  object must exist
    // postcondition for setters and getters: gets or sets the thingy

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return auth;
    }

    public void setAuthor(Author author) {
        this.auth = author;
        this.setCreator(author.getName());
    }
}
