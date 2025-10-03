import java.util.Scanner;

public class LuasTanah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang tanah: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        int lebar = input.nextInt();

        System.out.print("Masukkan diameter kolam lingkaran: ");
        int diameter = input.nextInt();
        System.out.print("Masukkan sisi kolam persegi: ");
        int sisi = input.nextInt();

        double luasTanah = panjang * lebar;
        double jari2 = diameter / 2.0;
        double luasLingkaran = Math.PI * jari2 * jari2;
        double totalLingkaran = 2 * luasLingkaran;
        double luasPersegi = sisi * sisi;

        double luasTanahRumput = luasTanah - (totalLingkaran + luasPersegi);

        System.out.println("Luas tanah rumput: " + luasTanahRumput);

        input.close();
    }
}

