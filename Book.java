import java.util.ArrayList;

public class Book extends Media{

    private int stock;
    private ArrayList<Review> reviews;


    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
//        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview (Review r ){
    reviews.add(r);
    }
    public double getAverageRating(){
        double totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }
        double ave =totalRating / reviews.size();
        return ave;
    }

    public void purchase(User user){
        user.getPurchasedMediaList().add(this);
        this.stock--;
    }
    public  boolean isBestsellar(){
      return getAverageRating()>=4.5;

    }
    public void restock(int quantity){
stock+=quantity;
        System.out.println("Restocked " + getTitle() + ". New quantity in stock: " + stock);
    }

    @Override
    public String getMediaTybe() {
        if( getAverageRating()>=4.5){
            return "Bestselling Book";
        }
        else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }

    //    @Override
//    public String getMediaTybe() {
//        if(duration>=120){
//            return "Bestselling Book";
//        }
//        else {
//            return "Book";
//        }
//    }
}
