import java.util.Scanner;

public class nestedUjianSkripsi8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah Anda bebas kompen? (Yes/No): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Jumlah bimbingan dengan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Jumlah bimbingan dengan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        String pesan;

        if (bebasKompen.equalsIgnoreCase("Yes")) {
            if (bimbinganP1 >= 8) {
                if (bimbinganP2 >= 4) {
                    pesan = "Anda dapat mendaftar ujian skripsi";
                } else {
                    pesan = "Gagal: Bimbingan dengan Pembimbing 2 kurang";
                }
            } else {
                pesan = "Gagal: Bimbingan dengan Pembimbing 1 kurang";
            }
        } else {
            pesan = "Gagal: Anda masih memiliki kompen";
        }

        System.out.println(pesan);
        sc.close();
    }
}
