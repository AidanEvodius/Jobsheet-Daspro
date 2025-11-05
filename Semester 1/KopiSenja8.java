import java.util.Scanner;
public class KopiSenja8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int cabang = sc.nextInt();

        int totalpelanggansemua = 0;
        int totalitemsemua = 0;

         for (int i = 1; i <= cabang; i++) {
            System.out.print("\nMasukkan jumlah pelanggan di cabang ke-" + i + ": ");
            int pelanggan = sc.nextInt();

            int totalitemcabang = 0;

             for (int j = 1; j <= pelanggan; j++) {
                System.out.print("  Jumlah item yang dipesan pelanggan ke-" + j + ": ");
                int item = sc.nextInt();
                totalitemcabang += item;
             }

            System.out.println("Total item yang dipesan di cabang ke-" + i + ": " + totalitemcabang);
            totalpelanggansemua += pelanggan;
            totalitemsemua += totalitemcabang;
         }

          System.out.println("\n===== RINGKASAN PENJUALAN =====");
        System.out.println("Total seluruh pelanggan: " + totalpelanggansemua);
        System.out.println("Total seluruh item terjual: " + totalitemsemua);

        sc.close(); 


    }
}