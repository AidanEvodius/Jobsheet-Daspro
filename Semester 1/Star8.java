import java.util.Scanner;
public class Star8 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Masukkan nilai n = ");
        int n = Sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");

        }
        Sc.close();

    }

}
