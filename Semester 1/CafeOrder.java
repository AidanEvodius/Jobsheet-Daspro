import java.util.Scanner;   
public class CafeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] nama = new String[n];
        double[] harga = new double[n];
        double total = 0;

        for(int i = 0; i < n; i++) {
         System.out.print("Nama pesanan ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
            System.out.print("Harga: ");
            harga[i] = sc.nextDouble();
            sc.nextLine(); 
            total += harga[i];
        }
        System.out.println("\nDaftar Pesanan:");
        for(int i = 0; i < n; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ": " + nama[i] + " - Rp " + harga[i]);
        }
        System.out.println("Total Biaya: Rp " + total);

        sc.close();

    }

}
