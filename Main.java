import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static rekening[]  Rekening = {
            new rekening("16030927 3084", "Wallace", "Chase Castro","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu"),
            new rekening("16100617 0573", "Darius", "Julian Daniel","1-357-843-0547","nec@lectusjusto.org"),
            new rekening("16240401 2243", "Fuller", "Finn Dunlap","571-7062","ligula.convallis@Vestibulumanteipsum.org"),
            new rekening("16270525 0112", "Malcolm", "Keane Floyd","623-0234","porttitor.tellus.non@Curabitur.ca"),
            new rekening("16971204 2416", "Geoffrey", "Stephen Pratt","1-683-416-8323","ut.pellentesque@luctusutpellentesque.com")
    };

    static Transaksi[] transaksi = {
        new Transaksi(898214, 494048, 3587, "2021-03-09 07:54:42", " "),
        new Transaksi(205420,200162,775880,"2021-06-25 10:23:00", " "),
        new Transaksi(838632,350929,328316, "2021-09-18 23:00:04", " "),
        new Transaksi(230659,204434,690503, "2022-02-02 19:10:34", " "),
        new Transaksi(770592,334245,444267, "2020-08-11 13:36:56", " ")
    };

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===============================");
            System.out.println("1. Tampil Data Rekening");
            System.out.println("2. Tampil Data Transaksi");
            System.out.println("3. Mencari Saldo < 500000");
            System.out.println("4. Sorting By Name");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.println("Pilih (1-5)");
            pilihan = sc16.nextInt();

            switch(pilihan){
                case 1:
                    tampildataRekening();
                    break;
                case 2:
                    tampilDataTransaksi();
                    break;
                case 3:
                    saldominlimaPuluh();
                    break;
                case 4:
                    sortingByName();
                    break;
                case 5:
                    System.out.println("ANDA KELUAR");
                    break;
                default:
                    System.out.println("TIDAK ADA DALAM PILIHAN");
            }
        } while (pilihan != 5);
    }

    public static void tampildataRekening() {
        for (rekening r : Rekening) {
            r.tampildataRekening();
            System.out.println();
        }
    }

    public static void tampilDataTransaksi() {
        for (Transaksi t : transaksi) {
            t.tampilDataTransaksi();
            System.out.println();
        }
    }

    public static void saldominlimaPuluh() {
        for (rekening r : Rekening) {
            if (r.saldo < 500000) {
                r.tampildataRekening();
                System.out.println();
            }
        }
    }

    public static void sortingByName() {
        Arrays.sort(Rekening, Comparator.comparing(rekening::getNama));
        System.out.println("Data Rekening setelah sorting by name:");
        for (rekening r : Rekening) {
            r.tampildataRekening();
            System.out.println();
        }
    }
}

class rekening {
    long noRekening;
    String nama, namaIbu, Phone, email;
    long saldo; 

    public rekening(String a, String b, String c, String d, String e){
        String noRekeningClean = a.replaceAll("\\s", "");
        this.noRekening = Long.parseLong(noRekeningClean);
        this.nama = b;
        this.namaIbu = c;
        this.Phone = d;
        this.email = e;
        this.saldo = 0;
    }

    public void tampildataRekening(){
        System.out.printf("No Rekening: %12d\n", noRekening);
        System.out.printf("Nama: %20s\n", nama);
        System.out.printf("Nama Ibu: %15s\n", namaIbu);
        System.out.printf("Phone: %15s\n", Phone);
        System.out.printf("Email: %30s\n", email);
        System.out.printf("Saldo: %15d\n", saldo);
    }

    public String getNama() {
        return nama;
    }
}

class Transaksi {
    int noRekeningPengirim, noRekeningPenerima, jumlah;
    String waktu, keterangan;

    public Transaksi(int noRekeningPengirim, int noRekeningPenerima, int jumlah, String waktu, String keterangan) {
        this.noRekeningPengirim = noRekeningPengirim;
        this.noRekeningPenerima = noRekeningPenerima;
        this.jumlah = jumlah;
        this.waktu = waktu;
        this.keterangan = keterangan;
    }

    public void tampilDataTransaksi() {
        System.out.println("No Rekening Pengirim: " + noRekeningPengirim);
        System.out.println("No Rekening Penerima: " + noRekeningPenerima);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Waktu: " + waktu);
    }
}