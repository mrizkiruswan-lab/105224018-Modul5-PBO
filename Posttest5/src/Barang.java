public class Barang {

    //enkapsulasinya
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    private String kategori;

    //constructor
    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    //get
    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public String getKategori() {
        return kategori;
    }

    //set
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan <= 0) {
            System.out.println("Harganya tidak boleh <= 0");
        } else {
            this.hargaSatuan = hargaSatuan;
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlahnya tambah harus > 0");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah harus > 0");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi!");
        } else {
            stok -= jumlah;
        }
    }

    public void tampilkanDetailBarang() {
        System.out.println("===== DETAIL BARANG =====");
        System.out.println("ID Barang   : " + idBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Stok        : " + stok);
        System.out.println("Harga       : " + hargaSatuan);
    }
}