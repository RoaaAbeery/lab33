import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }
    @Override
    public String getMediaTybe() {
        if( getAverageRating()>=4.5){
            return "Bestselling AcademicBook";
        }
        else {
            return "AcademicBook";
        }}

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}

