import java.util.Scanner;

public class Tugas1Bioskop {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiket = 0;
        double totalPendapatan = 0;
        int jumlah;

        while (true) {
            System.out.print("Masukkan jumlah tiket dibeli (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah == 0)
                break;
            if (jumlah < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }

            double diskon = 0;
            if (jumlah > 10)
                diskon = 0.15;
            else if (jumlah > 4)
                diskon = 0.10;

            double totalHarga = jumlah * hargaTiket * (1 - diskon);
            System.out.println("Total harga: Rp " + totalHarga);

            totalTiket += jumlah;
            totalPendapatan += totalHarga;
        }

        System.out.println("\nTotal tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan    : Rp " + totalPendapatan);
    }
}
