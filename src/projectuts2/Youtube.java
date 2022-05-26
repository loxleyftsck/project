package projectuts2;

abstract public class Youtube implements Berdduit, Bernonton {

    private String namaChannel;
    protected double subscriber;
    protected double menonton;
    protected double likes;
    private DailyMotion dm;
    private DailyMotion[] dailymotion;

    public Youtube(String namaChannel, double subscriber, double menonton, double likes) {
        this.namaChannel = namaChannel;
        this.subscriber = subscriber;
        this.menonton = menonton;
        this.likes = likes;
    }

    public Youtube() {
        this.DailyMotion = new DailyMotion[];
        this.jumlahPegawai=0;
    }

    public void setNamaChannel(String namaChannel) {
        this.namaChannel = namaChannel;
    }

    public String getNamaChannel() {
        return namaChannel;
    }

    public double getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(double subscriber) {
        this.subscriber = subscriber;
    }

    public double getMenonton() {
        return menonton;
    }

    public void setMenonton(double menonton) {
        this.menonton = menonton;
    }

    public double getLikes() {
        return likes;
    }

    public void setLikes(double likes) {
        this.likes = likes;
    }

    public DailyMotion getDm() {
        return dm;
    }

    public void setDm(DailyMotion dm) {
        this.dm = dm;
    }

    public DailyMotion[] getDailymotion() {
        return dailymotion;
    }

    public void setDailymotion(DailyMotion[] dailymotion) {
        this.dailymotion = dailymotion;
    }
    
    public String toString() {
        return "NAMA CHANNEL : " + namaChannel + ",  " + "SUBSCRIBER : " + subscriber + ",  " + "TOTAL PENONTON : " + getMenonton();
    }
}