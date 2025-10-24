import java.util.Scanner;

public class CaseMethod1_Aidan {
    
    // Method untuk konversi nilai
    public static String[] konversiNilai(double nilai) {
        String huruf, mutu, kualifikasi;

        if (nilai > 80 && nilai <= 100) {
            huruf = "A";
            mutu = "4";
            kualifikasi = "Sangat Baik";
        } else if (nilai > 73 && nilai <= 80) {
            huruf = "B+";
            mutu = "3,5";
            kualifikasi = "Lebih dari Baik";
        } else if (nilai > 65 && nilai <= 73) {
            huruf = "B";
            mutu = "3";
            kualifikasi = "Baik";
        } else if (nilai > 60 && nilai <= 65) {
            huruf = "C+";
            mutu = "2,5";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilai > 50 && nilai <= 60) {
            huruf = "C";
            mutu = "2";
            kualifikasi = "Cukup";
        } else if (nilai > 39 && nilai <= 50) {
            huruf = "D";
            mutu = "1";
            kualifikasi = "Kurang";
        } else {
            huruf = "E";
            mutu = "0";
            kualifikasi = "Gagal";
        }

        return new String[]{huruf, mutu, kualifikasi};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double utsAlgo, uasAlgo, tugasAlgo;
        double utsStruk, uasStruk, tugasStruk;
        double nilaiAkhirAlgo, nilaiAkhirStruk, rata;
        String statusAlgo, statusStruk, statusSemester;

        System.out.println("=== Program Penentuan Kelulusan Mahasiswa ===");

        // Input nilai Algoritma dan Pemrograman
        System.out.println("\n-- Algoritma dan Pemrograman --");
        System.out.print("Masukkan nilai UTS: ");
        utsAlgo = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uasAlgo = input.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        tugasAlgo = input.nextDouble();

        // Input nilai Struktur Data
        System.out.println("\n-- Struktur Data --");
        System.out.print("Masukkan nilai UTS: ");
        utsStruk = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uasStruk = input.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        tugasStruk = input.nextDouble();

        // Hitung nilai akhir
        nilaiAkhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        nilaiAkhirStruk = (utsStruk * 0.3) + (uasStruk * 0.4) + (tugasStruk * 0.3);

        // Tentukan status kelulusan per mata kuliah
        statusAlgo = (nilaiAkhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";
        statusStruk = (nilaiAkhirStruk >= 60) ? "LULUS" : "TIDAK LULUS";

        // Tentukan status kelulusan semester (nested if)
        rata = (nilaiAkhirAlgo + nilaiAkhirStruk) / 2;
        statusSemester = (statusAlgo.equals("LULUS") && statusStruk.equals("LULUS") && rata >= 70) ? "LULUS" : "TIDAK LULUS";

        // Konversi nilai ke tabel
        String[] algoTabel = konversiNilai(nilaiAkhirAlgo);
        String[] strukTabel = konversiNilai(nilaiAkhirStruk);
        String[] rataTabel = konversiNilai(rata);

        // Tampilkan hasil
        System.out.println("\n=== HASIL PENILAIAN ===");
        System.out.printf("%-35s: %.2f\n", "Nilai Akhir Algoritma dan Pemrograman", nilaiAkhirAlgo);
        System.out.println("Status: " + statusAlgo);
        System.out.printf("Nilai Huruf: %s | Nilai Setara: %s | Kualifikasi: %s\n", algoTabel[0], algoTabel[1], algoTabel[2]);

        System.out.printf("\n%-35s: %.2f\n", "Nilai Akhir Struktur Data", nilaiAkhirStruk);
        System.out.println("Status: " + statusStruk);
        System.out.printf("Nilai Huruf: %s | Nilai Setara: %s | Kualifikasi: %s\n", strukTabel[0], strukTabel[1], strukTabel[2]);

        System.out.println("---------------------------------------------");
        System.out.printf("%-35s: %.2f\n", "Rata-Rata Semester", rata);
        System.out.println("Status Kelulusan Semester: " + statusSemester);
        System.out.printf("Nilai Huruf: %s | Nilai Setara: %s | Kualifikasi: %s\n", rataTabel[0], rataTabel[1], rataTabel[2]);

        input.close();
    }
}


