
import java.util.Scanner;

public class Matakuliah26 {
    Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah26 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("SKS         : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah Jam  : ");
        this.jumlahJam = sc.nextInt();
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        :" + nama);
        System.out.println("SKS         :" + sks);
        System.out.println("Jumlah Jam  :" + jumlahJam);
        System.out.println("--------------------------------------");
    }
}
