package projectuts2;

public class NewMain {

    public static void main(String[] args) {
        Youtube[] ytb = new Youtube[5];
        
        News nw = new News("Metro TV", 5110000, 3000000, 3000000);
        nw.setLikes(1);
        pgw[0] = mg;
        
        Serketaris sk = new Serketaris("215314010", "Rina", 2000000);
        pgw[1] = sk;
        
        Sales sg = new Sales("215314017", "Rani", 1000000);
        sg.setJumBarang(5);
        pgw[2] = sg;
        
        sg = new Sales("215314018", "Rina", 1000000);
        sg.setJumBarang(4);
        pgw[3] = sg;
       
        sg = new Sales("215314019", "Nina", 1000000);
        sg.setJumBarang(6);
        pgw[4] = sg;
        
        System.out.println("Daftar Pegawai: ");
        System.out.println("Manager: ");
        for (int m = 0; m < pgw.length; m++) {
            if(pgw[m] instanceof Manager) {
                System.out.println("nip: " + pgw[m].getNip() + ", " + "nama: " + pgw[m].getNama() + ", " + "dengan gaji total: " + pgw[m].getGajiTotal() +", "+ "tunjangan: " +  ((Manager) pgw[m]).getTunjangan());
                System.out.println("");
            }
        }
        System.out.println("Serketaris");
        for (int m = 0; m < pgw.length; m++) {
            if (pgw[m] instanceof Serketaris) {
                System.out.println("nip: " + pgw[m].getNip() + ", " + "nama: " + pgw[m].getNama() + ", " + "dengan gaji total: " + pgw[m].getGajiTotal());
                System.out.println("");
            }
        } 
        System.out.println("Sales");
        for (int m = 0; m < pgw.length; m++) {
            if (pgw[m] instanceof Sales) {
                System.out.println("nip: " + pgw[m].getNip() + ", " + "nama: " + pgw[m].getNama() + ", " + "dengan gaji total: " + pgw[m].getGajiTotal());
            }
        }
}
}
    }
    
}
