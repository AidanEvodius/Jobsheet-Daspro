import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        int total = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
              System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }

        double rata = (double) total / n;

        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nRata-rata nilai: " + rata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
           
        sc.close();

        }  

    }
