
public class Movie extends ItemForSale {
    private Double duration;

    public Movie(Double duration) {
        super("Unknown", "Unknown", 10.00, "June 7, 2067");
        this.duration = duration;
    }

    public Movie(String name, String creator, double price, String dateOfSale, Double duration) {
        super(name, creator, price, dateOfSale);
        this.duration = duration;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
