import java.util.Scanner;
public class Jumlahkuadrat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            int kuadrat = i * i;
            System.out.println(i + "^2 = " + kuadrat);
            total += kuadrat;
        }

        System.out.println("Jumlah kuadrat dari 1 sampai " + n + " = " + total);

        sc.close();

    }
}