/**
 * rekening
 */
public class rekening {
    String noRekening, nama, namaIbu, Phone, email;

    public void rekenings(String a, String b, String c, String d, String e){
        this.noRekening = a;
        this.nama = b;
        this.namaIbu = c;
        this.Phone = d;
        this.email = e;
    } 
    public void tampildataRekening(){
      System.out.printf("No Rekening: %12d\n", noRekening);
      System.out.printf("Nama: %20s\n", nama);
      System.out.printf("Nama Ibu: %15s\n", namaIbu);
      System.out.printf("Phone: %15s\n", Phone);
      System.out.printf("Email: %30s\n", email);

    }
}