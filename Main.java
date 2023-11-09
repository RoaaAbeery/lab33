import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Media m=new Media("movie1","ali","122",50.0);
Movie m1=new Movie("Movie1","Roaa","1111",40.0,90);
Movie m2=new Movie("Movie2","Amal","2222",50.0,120);
            List<Movie> movieCatalog;

Review r1=new Review ("Roaa_557",5,"thank you");
        Review r2=new Review ("amal_557",9,"thank you");
        ArrayList<Review> reviews ;

        Book b1=new Book("book1","ali","678",50.0,9);
        b1.addReview(r1);
        System.out.println(b1.getAverageRating());
        b1.restock(9);

        System.out.println(b1.getMediaTybe());
        Book b2=new Book("book2","ali","678",50.0,8);
        b2.addReview(r2);
        b2.getAverageRating();
        b2.restock(8);

        System.out.println(b1.getMediaTybe());
        Music mu1= new Music("music 1","abrar","999",40.0,"abrar");
        Music mu2= new Music("music 2","afnan","44444",60.0,"amani");
User us=new User("roaa","roaa@gmail.com");
            User us2=new User("rana","rana@gmail.com");

    }
}