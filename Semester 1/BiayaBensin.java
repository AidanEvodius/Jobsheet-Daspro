import java.util.Scanner;

public class BiayaBensin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        double liter = jarak / 2; // 1 liter untuk 2 km
        double biaya = liter * 10000;

        System.out.println("Biaya bensin perjalanan = Rp. " + biaya);

        input.close();
    }
}
