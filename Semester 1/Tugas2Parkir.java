import java.util.Scanner;
public class Tugas2Parkir {
        public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int tarifmobil = 3000, tarifmotor = 2000;
        int jenis, durasi;
        double total = 0;

        do {
            System.out.print("\nMasukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Selesai): ");
            jenis = scanner.nextInt();

            if (jenis == 0)
                break;
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = scanner.nextInt();

            double bayar = 0;
            if (durasi > 5) {
                bayar = 12500;
            } else if (jenis == 1) {
                bayar = durasi * tarifmobil;
            } else {
                bayar = durasi * tarifmotor;
            }
            System.out.println("Bayar parkir: Rp " + bayar);
            total += bayar;
        } while (true);
        System.out.println("\nTotal pendapatan parkir hari ini = Rp " + total);
    }
}
