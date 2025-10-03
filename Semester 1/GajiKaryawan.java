import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();

        int tunjTransp = 600000;
        int tunjMkn = 400000;
        double bonus = 0.05 * gajiPokok;
        double totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus = " + bonus);
        System.out.println("Total gaji = " + totGaji);


        input.close();
    }
}

