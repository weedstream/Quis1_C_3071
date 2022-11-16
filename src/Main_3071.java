import java.util.Scanner;
public class Main_3071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa_3071 mahasiswa_3071_1 = new Mahasiswa_3071();
        Mahasiswa_3071 mahasiswa_3071_2 = new Mahasiswa_3071();
        Dosen_3071 dosen_3071_1 = new Dosen_3071();
        Dosen_3071 dosen_3071_2 = new Dosen_3071();

        System.out.println("NIK                 : ");
        mahasiswa_3071_1.nik_3071 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3071_1.nama_3071 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3071_1.umur_3071 = input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3071_1.alamat_3071 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3071_1.nim_3071 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3071_1.ipk_3071 = input.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        mahasiswa_3071_2.nik_3071 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3071_2.nama_3071 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3071_2.umur_3071 = input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3071_2.alamat_3071 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3071_2.nim_3071 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3071_2.ipk_3071 = input.nextInt();
        

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA MAHASISWA");
        mahasiswa_3071_1.tampilDataBeasiswa_3071();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        mahasiswa_3071_2.tampilDataMahasiswa_3071_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3071_1.nik_3071 = input.next();
        System.out.println("Nama                : ");
        dosen_3071_1.nama_3071 = input.next();
        System.out.println("Umur                : ");
        dosen_3071_1.umur_3071 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3071_1.alamat_3071 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3071_1.nidn_3071 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3071_1.gol_3071 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3071_1.gajiPokok_3071);
        // dosen_3071_1.gajiPokok_3071 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3071_1.nik_3071 = input.next();
        System.out.println("Nama                : ");
        dosen_3071_1.nama_3071 = input.next();
        System.out.println("Umur                : ");
        dosen_3071_1.umur_3071 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3071_1.alamat_3071 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3071_1.nidn_3071 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3071_1.gol_3071 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3071_2.gajiPokok_3071);
        // dosen_3071_1.gajiPokok_3071 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA DOSEN");
        dosen_3071_1.tampilDataDosen_3071_1();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        dosen_3071_2.tampilDataDosen_3071_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        

        

    }
}
