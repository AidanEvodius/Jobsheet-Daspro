import java.util.Scanner;
public class CaseMethod8 {
    static Scanner sc = new Scanner(System.in);

    // Data: 100 mahasiswa; 7 kolom:
    // 0=Nama, 1=NIM, 2=Prodi, 3=Judul, 4=Dosen, 5=Gelombang, 6=Log
    static String[][] data = new String[100][7];
    static int count = 0;

    // ============================================================
    // MENU UTAMA
    // ============================================================
    static void menu() {
        System.out.println("\n======= MENU UTAMA =======");
        System.out.println("1. Tambah Data Pendaftar");
        System.out.println("2. Tampilkan Semua Data");
        System.out.println("3. Cari Berdasarkan Dosen");
        System.out.println("4. Cari Berdasarkan Prodi");
        System.out.println("5. Hitung Pendaftar Per Gelombang");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu: ");
    }

    // ============================================================
    // FITUR 1: TAMBAH DATA
    // ============================================================
    static void tambahData() {
        System.out.println("\n=== Tambah Data Pendaftar ===");

        System.out.print("Nama Mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("NIM            : ");
        String nim = sc.nextLine();

        System.out.print("Program Studi  : ");
        String prodi = sc.nextLine();

        System.out.print("Judul Skripsi  : ");
        String judul = sc.nextLine();

        System.out.print("Dosen Pembimbing : ");
        String dosen = sc.nextLine();

        // VALIDASI GELOMBANG
        int gel;
        while (true) {
            System.out.print("Gelombang (1/2/3): ");
            try {
                gel = Integer.parseInt(sc.nextLine());
                if (gel >= 1 && gel <= 3) break;
                System.out.println("!! Gelombang harus 1, 2, atau 3.");
            } catch (Exception e) {
                System.out.println("!! Input harus angka.");
            }
        }

        // VALIDASI LOG MINIMAL 8
        int log;
        while (true) {
            System.out.print("Total Log Bimbingan (>=8): ");
            try {
                log = Integer.parseInt(sc.nextLine());
                if (log >= 8) break;
                System.out.println("!! Minimal 8.");
            } catch (Exception e) {
                System.out.println("!! Input harus angka.");
            }
        }

        // SIMPAN DATA
        data[count][0] = nama;
        data[count][1] = nim;
        data[count][2] = prodi;
        data[count][3] = judul;
        data[count][4] = dosen;
        data[count][5] = String.valueOf(gel);
        data[count][6] = String.valueOf(log);
        count++;

        System.out.println(">> Data berhasil ditambahkan!");
    }

    // ============================================================
    // FITUR 2: TAMPILKAN DATA
    // ============================================================
    static void tampilkanData() {
        System.out.println("\n=== Semua Data Pendaftar ===");
          if (count == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.printf("%-20s %-12s %-15s %-22s %-18s %-10s %-10s\n",
                "Nama", "NIM", "Prodi", "Judul Skripsi",
                "Dosen Pembimbing", "Gel", "Log");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s %-12s %-15s %-22s %-18s %-10s %-10s\n",
                    data[i][0], data[i][1], data[i][2],
                    data[i][3], data[i][4], data[i][5], data[i][6]);
        }
    }

    // ============================================================
    // FITUR 3: CARI BERDASARKAN DOSEN
    // ============================================================
    static void cariDosen() {
        System.out.println("\n=== Cari Pendaftar Berdasarkan Dosen ===");
        System.out.print("Masukkan nama dosen: ");
        String target = sc.nextLine();
        boolean found = false;
          for (int i = 0; i < count; i++) {
            if (data[i][4].equalsIgnoreCase(target)) {
                if (!found) {
                    System.out.printf("%-20s %-12s %-15s %-22s %-18s %-10s %-10s\n",
                            "Nama", "NIM", "Prodi", "Judul Skripsi",
                            "Dosen Pembimbing", "Gel", "Log");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                }
                found = true;
                System.out.printf("%-20s %-12s %-15s %-22s %-18s %-10s %-10s\n",
                        data[i][0], data[i][1], data[i][2], data[i][3],
                        data[i][4], data[i][5], data[i][6]);
            }
        }

        if (!found) {
            System.out.println("Tidak ada mahasiswa dengan dosen tersebut.");
        }
    }

    // ============================================================
    // FITUR 4: CARI BERDASARKAN PRODI
    // ============================================================
        static void cariProdi() {
            System.out.println("\n=== Cari Pendaftar Berdasarkan Prodi ===");
            System.out.print("Masukkan nama prodi: ");
            String target = sc.nextLine();

            boolean found = false;
              for (int i = 0; i < count; i++) {
            if (data[i][2].equalsIgnoreCase(target)) {
                if (!found) {
                    System.out.printf("%-20s %-12s %-15s %-22s %-18s %-10s %-10s\n",
                            "Nama", "NIM", "Prodi", "Judul Skripsi",
                            "Dosen Pembimbing", "Gel", "Log");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                }
                found = true;
                System.out.printf("%-20s %-12s %-15s %-22s %-18s %-10s %-10s\n",
                        data[i][0], data[i][1], data[i][2], data[i][3],
                        data[i][4], data[i][5], data[i][6]);
            }
        }

        if (!found) {
            System.out.println("Tidak ada mahasiswa dari prodi tersebut.");
        }
    }

    // ============================================================
    // FITUR 5: HITUNG GELOMBANG
    // ============================================================
    static void hitungGel() {
        int g1 = 0, g2 = 0, g3 = 0;

        for (int i = 0; i < count; i++) {
            int gel = Integer.parseInt(data[i][5]);
            if (gel == 1) g1++;
            else if (gel == 2) g2++;
            else g3++;
        }

        System.out.println("\n=== Jumlah Pendaftar per Gelombang ===");
        System.out.println("Gelombang 1 : " + g1);
        System.out.println("Gelombang 2 : " + g2);
        System.out.println("Gelombang 3 : " + g3);
    }

     // ============================================================
    // FITUR 6: KELUAR PROGRAM 
    // ============================================================
    static void keluarProgram() {
        System.out.print("Yakin ingin keluar? (y/n): ");
        String jawab = sc.nextLine();

        if (jawab.equalsIgnoreCase("y")) {
            System.out.println("Program selesai. Terima kasih!");
            System.exit(0);
        } else {
            System.out.println("Kembali ke menu...");
        }
    }

    // ============================================================
    // MAIN PROGRAM
    // ============================================================
    public static void main(String[] args) {
        while (true) {
            menu();
            String p = sc.nextLine();

            switch (p) {
                case "1": tambahData(); break;
                case "2": tampilkanData(); break;
                case "3": cariDosen(); break;
                case "4": cariProdi(); break;
                case "5": hitungGel(); break;
                case "6": keluarProgram(); break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}



    