import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        int[] nilaiMhs = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        double rata2 = (double) total / jumlah;
        System.out.println("\nRata-rata nilai: " + rata2);

        sc.close();
    }
}
