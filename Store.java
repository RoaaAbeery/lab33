import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media>  medias;

    public Store(ArrayList<User> users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public void addUser(User user){
users.add(user);
}
    public void displayUsers(){
        System.out.println("List of Registered Users:");
        for (User user : users) {
            System.out.println("- " + user.getUsername() + " (" + user.getEmail() + ")");
        }
    }
    public void addMedia(Media media){
medias.add(media);
    }
    public void displayMedias(){
        System.out.println("List of Available Media:");
        for (Media media : medias) {
            System.out.println("- " + media.getMediaTybe() + ": " + media.getTitle() + " by " + media.getAuteur());
        }
    }
    public  Media searchBook (String title){
        for (Media media : medias) {
            if (media instanceof Book && media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;

    }
}
