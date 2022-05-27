package projectuts2;

public class NewMain {

    public static void main(String[] args) {
        videoplayer vp = new videoplayer();
        Youtube[] ytb = new Youtube[vp.MAX_USER];
        int jumlhUser= 0;
        
        News nw = new News("Metro TV", 51100, 30000, 40000);
        nw.setUser(2);
        ytb[jumlhUser++] = nw;
        
        nw = new News("Barudak", 21000, 30040, 4000);
        nw.setUser(2);
        ytb[jumlhUser++] = nw;
        
        nw = new News("mmk", 13242, 5311, 900);
        nw.setUser(2);
        ytb[jumlhUser++] = nw;
        
        Music mc = new Music("Hybe", 52500, 35320, 21000);
        mc.setUser(2);
        ytb[jumlhUser++] = mc;
        
        mc = new Music("SMTOWN", 51100, 60073, 30000);
        mc.setUser(1);
        ytb[jumlhUser++] = mc;
        
        vp.setYtb(ytb, jumlhUser);
      
        System.out.println("Daftar Channel Sesuai kategori: ");
        System.out.println("News: ");
        for (int m = 0; m < ytb.length; m++) {
            if(ytb[m] instanceof News) {
                System.out.print("Nama Channel: " + ytb[m].getNamaChannel() + " " + "Subscriber: " + ytb[m].getSubscribe() + ", "+ "Watch : " + ytb[m].getWatch() + ", " + "Like :" +ytb[m].getLikes() + " ," + Dengan penghasilan: " + ytb[m].getMonetise();
                System.out.println("");
            }
        }
        System.out.println("Music: ");
        for (int m = 0; m < ytb.length; m++) {
            if (ytb[m] instanceof Music) {
                System.out.println("Nama Channel: " + ytb[m].getSubscriber()+ ", " + "Subscriber: " + ytb[m].getSubscribe()+ ", " + ""+"dengan gaji total: " + ytb[m].getMonetise());
                System.out.println("");              
            }
        } 
        
}
    }