class RekeningBank {

    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;

        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            saldo = saldoBaru;
            System.out.println("Saldo berhasil diperbarui.");
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        RekeningBank rek = new RekeningBank("123456789", 1000);

        System.out.println("Nomor Rekening : " + rek.getNomorRekening());
        System.out.println("Saldo Awal     : " + rek.getSaldo());

        rek.setSaldo(2000);
        rek.setSaldo(-500); // akan ditolak

        System.out.println("Saldo Akhir    : " + rek.getSaldo());
    }
}