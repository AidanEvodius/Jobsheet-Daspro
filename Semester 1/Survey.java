import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int responden = 10;
        int pertanyaan = 6;
        int[][] nilai = new int[responden][pertanyaan];

        for (int i = 0; i < responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRata-rata setiap responden:");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) total += nilai[i][j];
            System.out.println("Responden " + (i + 1) + ": " + (total / pertanyaan));
        }

        System.out.println("\nRata-rata setiap pertanyaan:");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) total += nilai[i][j];
            System.out.println("Pertanyaan " + (j + 1) + ": " + (total / responden));
        } sc.close();
        
    }
}
