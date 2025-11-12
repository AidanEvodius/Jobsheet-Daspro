import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {
        int[] nilai = {75, 90, 85, 60, 100, 55};
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai ditemukan pada indeks ke-" + i);
                break; // menghentikan pencarian setelah ditemukan

                
            }
        }
        sc.close();
    }
}
