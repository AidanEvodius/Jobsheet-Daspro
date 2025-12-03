public class PengunjungCafe8 {

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Pengunjung Hari Ini:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Adit", "Budi", "Sinta");
        daftarPengunjung("Lukman");
        daftarPengunjung();
    }
}

