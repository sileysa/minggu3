
import java.util.Scanner;

public class DataDosen26 {
    Scanner sc = new Scanner(System.in);
    public static void dataSemuaDosen26(Dosen26[] arrayOfDosen26) {
        for (Dosen26 dosen : arrayOfDosen26) {
            dosen.dataDosen();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen26[] arrayOfDosen26) {
        int jmlPria = 0, jmlWanita = 0;
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.jenisKelamin) {
                jmlPria++;
            } else {
                jmlWanita++;
            }
        }
        System.out.println("Jumlah Pria     : " + jmlPria);
        System.out.println("Jumlah Wanita   : " + jmlWanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayOfDosen26) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, usiaPria = 0, usiaWanita = 0;
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                usiaPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                usiaWanita++;
            }
        }
        if (usiaPria > 0) {
            System.out.println("Rata2 Usia Pria     : " + totalUsiaPria / usiaPria);
        } else {
            System.out.println("Rata2 Usia Pria     : Data tidak ditemukan");
        }
        if (usiaWanita > 0) {
            System.out.println("Rata2 Usia Wanita   : " + totalUsiaWanita / usiaWanita);   
        } else {
            System.out.println("Rata2 Usia Pria     : Data tidak ditemukan");
        }
    }

    public static void infoDosenPalingTua(Dosen26[] arrayOfDosen26) {
        Dosen26 tua = arrayOfDosen26[0];
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.usia > tua.usia) {
                tua = dosen;
            }
        }
        tua.dataDosen();
    }
    
    public static void infoDosenPalingMuda(Dosen26[] arrayOfDosen26) {
        Dosen26 muda = arrayOfDosen26[0];
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.usia < muda.usia) {
                muda = dosen;
            }
        }
        muda.dataDosen();
    }
}
