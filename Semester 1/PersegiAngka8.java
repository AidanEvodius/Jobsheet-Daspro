import java.util.Scanner;

public class PersegiAngka8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        // Pola angka persegi
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
