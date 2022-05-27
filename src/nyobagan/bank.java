package nyobagan;

public abstract class bank implements TopUp {

    private String nama;
    private String noRek;
    private int saldo;
    private String masaAktif;

    public bank(String nama, String noRek , String masaAktif , int saldo ) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
        this.masaAktif = masaAktif;
    }

    public bank() {
        this("", "", "", 0);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getMasaAktif() {
        return masaAktif;
    }

    public void setMasaAktif(String masaAktif) {
        this.masaAktif = masaAktif;
    }
    
    @Override
    public int getTopUp() {
        return saldo;
    }
}