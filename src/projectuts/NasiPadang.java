package projectuts;

public class NasiPadang extends Foodcourt {
    public final int PAJAK_PERMEJA = 7000;

    public NasiPadang(String nama, String noMeja, int totalBayar) {
        super(nama, noMeja, totalBayar);
    }
    
    public NasiPadang() {
        super("","",0);
    }

    @Override
    public double getTotalPembayaran() {
        return totalBayar + PAJAK_PERMEJA;
    }
}