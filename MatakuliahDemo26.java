
import java.util.Scanner;

public class MatakuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Matakuliah26[] arrayOfMatakuliah26 = new Matakuliah26[3];
        String kode, nama, dummy;
        int sks, jumlahJam, jmlMatkul;
        
        System.out.print("Jumlah Mata Kuliah: ");
        jmlMatkul = sc.nextInt();
        sc.nextLine();

        Matakuliah26[] arrayOfMatakuliah26 = new Matakuliah26[jmlMatkul];

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayOfMatakuliah26[i] = new Matakuliah26(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode        : " + arrayOfMatakuliah26[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah26[i].nama);
            System.out.println("SKS         : " + arrayOfMatakuliah26[i].sks);
            System.out.println("Jumalah Jam : " + arrayOfMatakuliah26[i].jumlahJam);
            System.out.println();
            arrayOfMatakuliah26[i].tambahData();
            System.out.println("-------------------------------");
            arrayOfMatakuliah26[i].cetakInfo();
        }
    }
}
