import java.util.Scanner;

public class Triangle8 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Sc.nextInt();

        int i = 1; // Inisialisasi baris

         while (i <= n) {
            int j = 1; // kolom

            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println(); // pindah baris
            i++;
        }

        Sc.close();
    
       
    }

}
