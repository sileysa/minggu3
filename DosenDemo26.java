
import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen26[] arrayOfDosen26 = new Dosen26[3];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            char jk = sc.next().charAt(0);
            sc.nextLine();
            jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayOfDosen26[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }
        for (Dosen26 dosen : arrayOfDosen26) {
            dosen.dataDosen();
        }
        DataDosen26.dataSemuaDosen26(arrayOfDosen26);
        DataDosen26.jumlahDosenPerJenisKelamin(arrayOfDosen26);
        DataDosen26.rerataUsiaDosenPerJenisKelamin(arrayOfDosen26);
        DataDosen26.infoDosenPalingTua(arrayOfDosen26);
        DataDosen26.infoDosenPalingMuda(arrayOfDosen26);
    }
}
