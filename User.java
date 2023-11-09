import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchasedMediaList;
    private List<Media> shoppingCart;

    public User(String username, String email, List<Media> purchasedMediaList, List<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = purchasedMediaList;
        this.shoppingCart = shoppingCart;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(List<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
//    static ArrayList<Media>purchasedMediaList =new ArrayList<Media>();
//    static ArrayList<Media>shoppingCart =new ArrayList<Media>();

public void addTocart(Media media){
    shoppingCart.add(0,media);
    shoppingCart.add(1,media);
    shoppingCart.add(2,media);
}
    public void removeFrom(Media media){
        shoppingCart.remove(0);
    }
    public void checkout(){
        purchasedMediaList.addAll(shoppingCart);
        shoppingCart.clear();
    }



}

