import  java.util.Scanner;
public class Square8 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
         System.out.print("Masukkan nilai n = ");
        int n = Sc.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {

            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Sc.close();
    }

}
