public class ItemForSale
{
    private String creator;
    private String name;
    private Double price;
    private String dateOfSale;

    public ItemForSale(String n, String c, Double p, String d){
        creator = c;
        name = n;
        price = p;
        dateOfSale = d;
    }

    public String creatorName(){
        return creator;
    }


}
