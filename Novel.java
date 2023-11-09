import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    @Override
    public String getMediaTybe() {
        if( getAverageRating()>=4.5){
            return "Bestselling Novel";
        }
        else {
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}






