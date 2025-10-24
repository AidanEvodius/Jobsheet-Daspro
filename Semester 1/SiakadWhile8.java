import java.util.Scanner;

public class SiakadWhile8 {
    public static void main(String[] args) {
        
    @SuppressWarnings("resource")


        Scanner sc = new Scanner(System.in);

        int nilai , jml, i= -0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai = sc.nextInt();
            
                        if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, silakan input ulang!");
                continue; // lewati ke iterasi berikut tanpa menambah i
            }

            if (nilai > 80)
                System.out.println("Nilai huruf: A");
            else if (nilai > 73)
                System.out.println("Nilai huruf: B+");
            else if (nilai > 65)
                System.out.println("Nilai huruf: B");
            else if (nilai > 60)
                System.out.println("Nilai huruf: C+");
            else if (nilai > 50)
                System.out.println("Nilai huruf: C");
            else if (nilai > 39)
                System.out.println("Nilai huruf: D");
            else
                System.out.println("Nilai huruf: E");

            i++;

              
        }

    }

}
