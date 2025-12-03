import java.util.Scanner;

public class RekapPenjualanCafe8 {
  static void inputData(int[][] data) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Menu " + (i+1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari " + (j+1) + ": ");
                data[i][j] = sc.nextInt();

            }
        }
    }

   
    static void tampilData(int[][] data) {
        System.out.println("\n=== Tabel Penjualan ===");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Menu " + (i+1) + ": ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
  static void penjualanTertinggi(int[][] data) {
        int maxMenu = 0;
        int maxJumlah = 0;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) total += data[i][j];
            if (total > maxJumlah) {
                maxJumlah = total;
                maxMenu = i;
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: Menu " + (maxMenu+1) + ", total = " + maxJumlah);
    }

    static void rataRata(int[][] data) {
        System.out.println("\nRata-rata penjualan:");
        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) total += data[i][j];
            System.out.println("Menu " + (i+1) + ": " + (total / 7.0));
        }
    }

    public static void main(String[] args) {
        int[][] data = new int[5][7];

        inputData(data);
        tampilData(data);
        penjualanTertinggi(data);
        rataRata(data);
    }
}   