import java.util.Scanner;
public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int siswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int mk = sc.nextInt();

        int[][] nilai = new int[siswa][mk];

        for (int i = 0; i < siswa; i++) {
            System.out.println("Input nilai untuk siswa ke-" + (i + 1));
            for (int j = 0; j < mk; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRata-rata setiap siswa:");
        for (int i = 0; i < siswa; i++) {
            double total = 0;
            for (int j = 0; j < mk; j++) {
                total += nilai[i][j];
            }
            System.out.println("Siswa " + (i + 1) + ": " + (total / mk));
        }

        System.out.println("\nRata-rata setiap mata kuliah:");
        for (int j = 0; j < mk; j++) {
            double total = 0;
            for (int i = 0; i < siswa; i++) {
                total += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + (total / siswa));

        sc.close();
        }
    }

}
