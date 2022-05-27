package projectuts2;
public class Music extends Youtube {
    
    public final int SEKALI_NONTON = 245;
    public int user;
    
    public Music(String namaChannel, int subscriber, int watch,int likes) {
        super(namaChannel, subscriber, watch, likes);
    }
    
    public Music() {
        super("",0,0,0);
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }
    
    @Override
    public int getSubscribe() {
        subscriber = user + subscriber;
        return subscriber;
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