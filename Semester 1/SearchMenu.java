import java.util.Scanner;

public class SearchMenu {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println(menu[i] + " tersedia di menu (indeks ke-" + i + ")");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan)
            System.out.println("Maaf, " + cari + " tidak tersedia di menu.");

            sc.close();
    }
}
        
