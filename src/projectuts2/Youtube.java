package projectuts2;

abstract public class Youtube implements Berdduit, Bernonton {

    private String namaChannel;
    protected int subscriber;
    protected int watch;
    protected int likes;

    public Youtube(String namaChannel, int subscriber, int watch, int likes) {
        this.namaChannel = namaChannel;
        this.subscriber = subscriber;
        this.watch = watch;
        this.likes = likes;
    }

    public void setNamaChannel(String namaChannel) {
        this.namaChannel = namaChannel;
    }

    public String getNamaChannel() {
        return namaChannel;
    }

    public int getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(int subscriber) {
        this.subscriber = subscriber;
    }

    public int getWatch() {
        return watch;
    }

    public void setWatch(int watch) {
        this.watch = watch;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public String toString() {
        return "NAMA CHANNEL : " + namaChannel + ",  " + "SUBSCRIBER : " + getSubscriber() + ",  " + "TOTAL PENONTON : " + getWatch();
    }
}