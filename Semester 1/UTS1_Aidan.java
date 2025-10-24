import java.util.Scanner;

public class UTS1_Aidan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jalur masuk (SNBP, SNBT, Mandiri): ");
        String jalur = input.nextLine().trim().toUpperCase();

        System.out.print("Masukkan nilai akhir: ");
        double nilai = input.nextDouble();

        double nilaiMinimal;
        switch (jalur) {
            case "SNBP":
                nilaiMinimal = 65;
                break;
            case "SNBT":
                nilaiMinimal = 60;
                break;
            case "MANDIRI":
                nilaiMinimal = 50;
                break;
            default:    
                System.out.println("Jalur masuk tidak valid.");
                input.close();              
            return;

        }

        System.out.println("\n=== Hasil Seleksi ===");
        System.out.println("Jalur masuk: " + jalur);
        System.out.println("Nilai akhir: " + nilai);
        System.out.println("Minimal nilai lulus: " + nilaiMinimal);

        if (nilai >= nilaiMinimal) {
            System.out.println("lulus ");
        } else {
            System.out.println("TIDAK LULUS");
        }

        input.close();
    }
}

