import java.util.Scanner;

public class KafeDoWhile8 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        final int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (atau 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal"))
                break;

            System.out.print("Jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh  : ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti : ");
            roti = sc.nextInt();

            int total = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + namaPelanggan + " = Rp " + total);

            sc.nextLine(); // membersihkan newline buffer
        } while (true);

        System.out.println("Transaksi selesai.");
    }
}

