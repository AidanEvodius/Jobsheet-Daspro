

    import java.util.Scanner;

public class CicilanMotor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga motor: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan uang muka: ");
        double uangMuka = input.nextDouble();

        System.out.print("Masukkan lama cicilan (bulan): ");
        int bulan = input.nextInt();

        double sisa = harga - uangMuka;
        double bunga = 0.01 * sisa; // bunga per bulan
        double cicilanPerBulan = (sisa / bulan) + bunga;

        System.out.println("Cicilan per bulan = " + cicilanPerBulan);

        input.close();      
    }
} 
        

