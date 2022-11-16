public class Mahasiswa_3071 extends Penduduk_3071 {
  String nim_3071;
  float ipk_3071;
  boolean beasiswa_3071;

  public void tampilDataMahasiswa_3071 () {
    super.tampilDataPenduduk_3071();
    System.out.println("NIK                 : " + nik_3071);
    System.out.println("Nama                : " + nama_3071);
    System.out.println("Umur                : " + umur_3071);
    System.out.println("Alamat              : " + alamat_3071);
    System.out.println("NIM                 : " + nim_3071);
    System.out.println("IPK                 : " + ipk_3071);
    tampilDataBeasiswa_3071();
  }

  public void tampilDataMahasiswa_3071_2 () {
    super.tampilDataPenduduk_3071();
    System.out.println("NIK                 : " + nik_3071);
    System.out.println("Nama                : " + nama_3071);
    System.out.println("Umur                : " + umur_3071);
    System.out.println("Alamat              : " + alamat_3071);
    System.out.println("NIM                 : " + nim_3071);
    System.out.println("IPK                 : " + ipk_3071);
    tampilDataBeasiswa_3071();
  }

  public void tampilDataBeasiswa_3071 () {
    if (ipk_3071 > 3.5) {
      beasiswa_3071 = true;
      System.out.println("Mahasiswa bernama " + nama_3071 + " berhak mendapatkan beasiswa");
    }
    else if (ipk_3071 < 3.5) {
      beasiswa_3071 = false;
      System.out.println("Mahasiswa bernama " + nama_3071 + " tidak berhak mendapatkan beasiswa");
    }
  }
}
