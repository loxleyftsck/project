package projectuts2;
public class News extends Youtube {
    
    public final double SEKALI_NONTON = 245;
    public int user;
    
    public News(String namaChannel, double subscriber, double menonton, double likes) {
        super(namaChannel, subscriber, menonton, likes);
    }
    
    public News() {
        super("",0,0,0);
    }

    public double getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }
    
    @Override
    public double getSubscribe() {
        return user + subscriber;
    }
    
    @Override
    public double getLike() {
        return user + likes;
    }

    @Override
    public double getMonetise() {
        return menonton * SEKALI_NONTON;
    }
}