import java.util.Scanner;

public class SistemPerpustakaanWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah Anda membawa kartu mahasiswa? (true/false): ");
        boolean punyaKartu = sc.nextBoolean();

        System.out.print("Apakah Anda sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (punyaKartu || registrasiOnline) {
            System.out.println("Akses diterima. Selamat datang di perpustakaan & WIFI kampus!");
        } else {
            System.out.println("Akses ditolak. Silakan bawa kartu mahasiswa atau lakukan registrasi online terlebih dahulu.");
        }

        sc.close();
    }
}
