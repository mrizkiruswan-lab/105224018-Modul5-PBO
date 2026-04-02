public class Main {
    public static void main(String[] args) {

        Barang barang = new Barang("B105224018", "Iphone 17 ProMax");

        barang.setKategori("Elektronik");

        barang.setHargaSatuan(-1000); 
        barang.kurangiStok(10);     

        barang.setHargaSatuan(15000000);
        barang.tambahStok(50);
        barang.kurangiStok(10);

        barang.tampilkanDetailBarang();
    }
}