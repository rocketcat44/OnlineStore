
public class Author {
    private String name;
    private String date;

    public Author(String name) {
        this.name = name;
        this.date = "";
    }

    public Author(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }
}
