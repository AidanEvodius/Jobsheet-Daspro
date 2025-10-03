import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();

        System.out.print("Masukkan tunjangan per anak: ");
        int tunjanganPerAnak = input.nextInt();

        int tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = 0.05 * gajiPokok;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;

        System.out.println("Gaji Bersih: " + gajiBersih);

        input.close();  
    }
}

