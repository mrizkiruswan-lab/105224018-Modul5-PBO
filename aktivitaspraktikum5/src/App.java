public class App {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "ruswan";
        // mhs.nim = "105224018"
        System.out.println(mhs.nama);
        mhs.setNim("105224018");
        System.out.println(mhs.getNim());
        System.out.println(mhs.namaOr);
    }
}
