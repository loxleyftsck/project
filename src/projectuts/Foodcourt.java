package projectuts;

    abstract public class Foodcourt implements TotalPembayaran {

        private String nama;
        private String noMeja;
        protected int totalBayar;

        public Foodcourt(String nama, String noMeja, int totalBayar) {
            this.nama = nama;
            this.noMeja = noMeja;
            this.totalBayar = totalBayar;
        }
        
        public Foodcourt() {
            this("","",0);
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNama() {
            return nama;
        }

        public String getNoMeja() {
            return noMeja;
        }

        public void setNoMeja(String noMeja) {
            this.noMeja = noMeja;
        }

        public int getTotalBayar() {
            return totalBayar;
        }

        public void setTotalBayar(int totalBayar) {
            this.totalBayar = totalBayar;
        }

        public String toString() {
            return "Nama : " + nama + ",  " + "Nomer Meja : " + noMeja + ",  " + "Total Pembelian : " + getTotalBayar();
        }
    }