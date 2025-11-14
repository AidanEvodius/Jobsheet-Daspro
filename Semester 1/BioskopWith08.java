import java.util.Scanner;  
public class BioskopWith08 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String[][] penonton = new String[4][2];
    int menu;

    do{
        System.out.println("\n=== Menu Bioskop ===");
        System.out.println("1. Input Data Penonton");
        System.out.println("2. Tampilkan Data Penonton");
        System.out.println("3. Keluar");

        System.out.print("Pilih menu (1-3): ");
        menu = sc.nextInt();    

        if (menu == 1) {
                System.out.print("Masukkan baris (0-3): ");
                int baris = sc.nextInt();
                System.out.print("Masukkan kolom (0-1): ");
                int kolom = sc.nextInt();
                sc.nextLine(); // clear buffer

                if (baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2) {
                    System.out.println("Nomor kursi tidak tersedia!");
                } else if (penonton[baris][kolom] != null) {
                    System.out.println("Kursi sudah terisi!");
                } else {
                    System.out.print("Masukkan nama penonton: ");
                    penonton[baris][kolom] = sc.nextLine();
                    System.out.println("Data berhasil dimasukkan.");
                }
            } else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            }
    }  while (menu != 3);
        System.out.println("Program selesai.");
    sc.close();
}

}
