package nyobagan;

public class GOPAY extends eWallet {
    public final int FEE_TOPUP = 1000;
    public final int MAX_LIMIT = 2000000;
    private int isiSaldo;

    public GOPAY(String nama, String nomer, int saldo) {
        super(nama, nomer, saldo);
    }

    public GOPAY() {
        super("", "", 0);
    }

    public int getIsiSaldo() {
        return isiSaldo;
    }

    public void setIsiSaldo(int isiSaldo) {
        this.isiSaldo = isiSaldo;
    }
    
    @Override
    public int getTopUp() {
        return (saldo + isiSaldo) - FEE_TOPUP;
    }
    
    @Override
    public int getLimit() {
        return MAX_LIMIT - getTopUp();
    }
}