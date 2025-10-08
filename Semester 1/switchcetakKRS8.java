import java.util.Scanner;

public class switchcetakKRS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan semester Anda: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("Cetak KRS Semester 1");
                break;
            case 2:
                System.out.println("Cetak KRS Semester 2");
                break;
            case 3:
                System.out.println("Cetak KRS Semester 3");
                break;
            case 4:
                System.out.println("Cetak KRS Semester 4");
                break;
            default:
                System.out.println("Semester tidak dikenali!");
        }

        sc.close();
    }
}

