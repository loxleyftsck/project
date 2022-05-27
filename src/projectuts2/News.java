package projectuts2;

public class News extends Youtube {

    public final double SEKALI_NONTON = 245;
    public int user;

    public News(String namaChannel, int subscriber, int watch, int likes) {
        super(namaChannel, subscriber, watch, likes);
    }

    public News() {
        super("", 0, 0, 0);
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Override
    public int getSubscribe() {
        return user + subscriber;
    }

    @Override
    public int getLike() {
        return user + likes;
    }

    @Override
    public double getMonetise() {
        return watch * SEKALI_NONTON;
    }
}
