package projectuts2;

public class NewMain {

    public static void main(String[] args) {
        Youtube[] ytb = new Youtube[5];
        
        News nw = new News("Metro TV", 5110000, 3000000, 3000000);
        nw.setLikes(1);
        nw.setSubscriber(1);
        ytb[0] = nw;
        
        nw = new News("Barudak", 2100000, 30000040, 30000300);
        nw.setLikes(1);
        nw.setSubscriber(1);
        ytb[1] = nw;
        
        nw = new News("mmk", 1343242, 534515, 132414);
        nw.setLikes(1);
        nw.setSubscriber(1);
        ytb[2] = nw;
        
        Music mc = new Music("Hybe", 5250020, 3532000, 30054200);
        nw.setLikes(1);
        nw.setSubscriber(1);
        ytb[3] = mc;
        
        mc = new Music("SMTOWN", 51105000, 60500000, 6007300);
        nw.setLikes(1);
        nw.setSubscriber(1);
        ytb[4] = mc;
        
        System.out.println("Daftar Pegawai: ");
        System.out.println("Manager: ");
        for (int m = 0; m < ytb.length; m++) {
            if(pgw[m] instanceof News) {
                System.out.println("nip: " + ytb[m].getNip() + ", " + "nama: " + ytb[m].getNama() + ", " + "dengan gaji total: " + ytb[m].getGajiTotal();
                System.out.println("");
            }
        }
        System.out.println("Serketaris");
        for (int m = 0; m < ytb.length; m++) {
            if (pgw[m] instanceof Music) {
                System.out.println("nip: " + ytb[m].getSubscriber()+ ", " + "nama: " + ytb[m].getLikes()+ ", " + "dengan gaji total: " + ytb[m].());
                System.out.println("");
            }
        } 

}
    }