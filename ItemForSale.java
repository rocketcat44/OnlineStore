
public class ItemForSale {
    private String creator;
    private String name;
    private Double price;
    private String dateOfSale;

    public ItemForSale(String name, String creator, Double price, String dateOfSale) {
        this.creator = creator;
        this.name = name;
        this.price = price;
        this.dateOfSale = dateOfSale;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public String creatorName() {
        return creator;
    }
}
