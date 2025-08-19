public class Book {
    private String name;
    private String writer;
    private double rating;
    private int reviewCount;
    private int cost;
    private int pubYear;
    private String type;

    public Book(String name, String writer, double rating, int reviewCount, int cost, int pubYear, String type) {
        this.name = name;
        this.writer = writer;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.cost = cost;
        this.pubYear = pubYear;
        this.type = type;
    }

    public String getName() { return name; }
    public String getWriter() { return writer; }
    public double getRating() { return rating; }
    public int getReviewCount() { return reviewCount; }
    public int getCost() { return cost; }
    public int getPubYear() { return pubYear; }
    public String getType() { return type; }

    public void showInfo() {
        System.out.println("Name: " + name + ", Author: " + writer +", Rating: " + rating + ", Reviews: " + reviewCount +", Price: $" + cost + ", Year: " + pubYear +", Genre: " + type);
    }
}
