package nyobagan;

public abstract class eWallet implements TopUp, limit{
    private String nama;
    private String nomer;
    protected int saldo;
    
    public eWallet(String nama, String nomer, int saldo) {
        this.nama = nama;
        this.nomer = nomer;
        this.saldo = saldo;
    }
    
    public eWallet() {   
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public String toString() {
        return "Nama : " + nama + ",  " + "Nomer : " + nomer;
    }
}