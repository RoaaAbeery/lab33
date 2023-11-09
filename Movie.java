import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch (User user){

        user.getPurchasedMediaList().add(this);
    }
public ArrayList<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
    ArrayList<Movie> similarMovies=new ArrayList<Movie>();

    for (Movie movie : movieCatalog) {

  if(movie.equals(getAuteur())&&!movie.getTitle().equals(getTitle())) {
      similarMovies.add(movie);
  }}

return similarMovies;

}

    @Override
    public String getMediaTybe() {
        if(duration>=120){
            return "Long movie";
        }
        else {
            return "Movie";
    }

}}
