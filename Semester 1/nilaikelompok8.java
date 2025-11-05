import java.util.Scanner;
public class nilaikelompok8 {
              public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1; // nomor kelompok
        double totalNilai, rataNilai;
        double rataNilaiTertinggi = 0;
        int kelompokTertinggi = 0;

        while (i <= 6) { // untuk 6 kelompok
            totalNilai = 0; // reset total tiap kelompok

            System.out.println("\nKelompok " + i);
            for (int j = 1; j <= 5; j++) { // 5 penilai
                System.out.print("Masukkan nilai dari penilai ke-" + j + ": ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata kelompok " + i + " = " + rataNilai);

            if (rataNilai > rataNilaiTertinggi) {
                rataNilaiTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            
            i++;
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi adalah: " + kelompokTertinggi);
        System.out.println("Dengan nilai rata-rata = " + rataNilaiTertinggi);

        sc.close();
    }
}
