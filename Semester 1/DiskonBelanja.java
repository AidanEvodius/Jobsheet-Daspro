import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.print("Masukkan harga barang: ");
        int harga = input.nextInt();

        double diskon = 0.15;
        double potongan = diskon * harga;
        double jmlBayar = harga - potongan;

        System.out.println("Potongan = " + potongan);
        System.out.println("Jumlah bayar = " + jmlBayar);

        input.close();
    }
      
}

    
