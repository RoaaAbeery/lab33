import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){
        user.getPurchasedMediaList().add(this);

}
    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog) {
        ArrayList<Music> similarSongs = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(this.getArtist()) && music != this) {
                similarSongs.add(music);
            }
        }
        return similarSongs;
    }

    @Override
    public String getMediaTybe() {
        if(getPrice()>=10){
            return "Premium Music";
        }else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
