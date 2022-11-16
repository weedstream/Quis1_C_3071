public class Dosen_3071 extends Penduduk_3071 {
  String nidn_3071;
  String gol_3071;
  int gajiPokok_3071 = 5500000;
  double totalGaji;
  int tunjangan;

  public double totalPendapatan_3071 () {
    if (gol_3071 == "IIIA") {
      tunjangan = 300000;
    }
    else if (gol_3071 == "IIIB") {
      tunjangan = 500000;
    }
    else if (gol_3071 == "IIIC") {
      tunjangan = 700000;
    }
    return totalGaji = gajiPokok_3071 + tunjangan;
  }

  public void tampilDataDosen_3071_1 () {
    super.tampilDataPenduduk_3071();
    System.out.println("NIK                   : " + nik_3071);
    System.out.println("Nama                  : " + nama_3071);
    System.out.println("Umur                  : " + umur_3071);
    System.out.println("Alamat                : " + alamat_3071);
    System.out.println("NIDN                  : " + nidn_3071);
    System.out.println("Golongan              : " + gol_3071);
    System.out.println("Gaji Pokok            : " + gajiPokok_3071);
  }

  public void tampilDataDosen_3071_2 () {
    super.tampilDataPenduduk_3071();
    System.out.println("NIK                   : " + nik_3071);
    System.out.println("Nama                  : " + nama_3071);
    System.out.println("Umur                  : " + umur_3071);
    System.out.println("Alamat                : " + alamat_3071);
    System.out.println("NIDN                  : " + nidn_3071);
    System.out.println("Golongan              : " + gol_3071);
    System.out.println("Gaji Pokok            : " + gajiPokok_3071);
  }
}
