
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa26[] arrayOfMahasiswa26 = new Mahasiswa26[3];
        String dummy;

        arrayOfMahasiswa26[0] = new Mahasiswa26();
        arrayOfMahasiswa26[0].nim = "244107060033";
        arrayOfMahasiswa26[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa26[0].kelas = "SIB-1E";
        arrayOfMahasiswa26[0].ipk = (float)3.75;

        arrayOfMahasiswa26[1] = new Mahasiswa26();
        arrayOfMahasiswa26[1].nim = "2341720172";
        arrayOfMahasiswa26[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa26[1].kelas = "TI-2A";
        arrayOfMahasiswa26[1].ipk = (float)3.36;

        arrayOfMahasiswa26[2] = new Mahasiswa26();
        arrayOfMahasiswa26[2].nim = "244107023006";
        arrayOfMahasiswa26[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa26[2].kelas = "TI-2E";
        arrayOfMahasiswa26[2].ipk = (float)3.80;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa26[i].cetakInfo();
            /*System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("NIM     : " + arrayOfMahasiswa26[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa26[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa26[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa26[i].ipk);
            System.out.println("--------------------------------");*/

        }

        /*for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa26[i] = new Mahasiswa26();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa26[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa26[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa26[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa26[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }*/

        /*System.out.println("NIM     : " + arrayOfMahasiswa26[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa26[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa26[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa26[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa26[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa26[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa26[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa26[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa26[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa26[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa26[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa26[0].ipk);*/
    }
}
