public class Karyawan {
    //soal nomor 1
    private String idKaryawan;
    private String nama;

    //soal nomor 2
    private double gajiPokok;

    //soal nomor 3 
    private String departemen;

    //constructor
    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Error kerana Gaji tidak boleh negatif!");
        } else {
            this.gajiPokok = gajiPokok;
            System.out.println("Gaji berhasil diperbarui.");
        }
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void tampilkanDataKaryawan() {
        System.out.println("===== DATA KARYAWAN =====");
        System.out.println("ID         : " + idKaryawan);
        System.out.println("Nama       : " + nama);
        System.out.println("Departemen : " + departemen);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}