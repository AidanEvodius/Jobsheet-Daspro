import java.util.Scanner;

public class ArrayNilai08 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Input nilai 10 mahasiswa
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Tampilkan semua nilai yang sudah diinput
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilaiAkhir[i]);

            sc.close();
        }
    }
}

