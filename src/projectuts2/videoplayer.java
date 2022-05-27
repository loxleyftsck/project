package projectuts2;

public class videoplayer {
    public final int MAX_USER = 20;
    private String tanggal;
    private Youtube youtube;
    private Youtube[] ytb;
    private int jumlahUser;
    
    public videoplayer() {
        this.ytb = new Youtube[MAX_USER];
        this.jumlahUser=0;
    }
    
    public videoplayer(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Youtube getYoutube() {
        return youtube;
    }

    public void setYoutube(Youtube youtube) {
        this.youtube = youtube;
    }

    public Youtube[] getYtb() {
        return ytb;
    }

    public void setYtb(Youtube[] ytb, int jumlahUser) {
        this.ytb = ytb;
        this.jumlahUser = jumlahUser;
    }
                
    public String toString() {
        for (int p=0; p<jumlahUser;p++){
            System.out.println(ytb[p]);
            System.out.println();
    }
        return "";
}
}