import java.util.Scanner;

public class ifcetakKRS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Silakan cetak KRS Anda.");
        }

        String pesan = (uktLunas) ? "Silakan cetak KRS Anda."
                          : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
System.out.println(pesan);

        sc.close();
    }
}
