package projectuts2;
public class Music extends Youtube {
    
    public final int SEKALI_NONTON = 245;
    public int user;
    
    public Music(String namaChannel, double subscriber, double menonton, double likes) {
        super(namaChannel, subscriber, menonton, likes);
    }
    
    public Music() {
        super("",0,0, 0);
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