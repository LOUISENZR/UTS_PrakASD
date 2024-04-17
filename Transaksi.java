public class Transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String tglTransaksi, type;
    
    public void transaksi(double a, double b, double c, String d, String e){
        this.saldo = a;
        this.saldoAwal = b;
        this.saldoAkhir = c;
        this.tglTransaksi = d;
        this.type = e;
    }
    public void dataTransaksi(){
        System.out.printf("Saldo: %12d\n", saldo);
        System.out.printf("Saldo Awal: %20s\n", saldoAwal);
        System.out.printf("Saldo Akhir: %15s\n", saldoAkhir);
        System.out.printf("Tanggal Transaksi: %15s\n", tglTransaksi);
        
    }
}
