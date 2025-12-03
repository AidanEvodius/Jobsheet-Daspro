public class Kubus8 {

    static int volume(int sisi) {
        return sisi * sisi * sisi;
    }

    static int luasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int s = 5;

        System.out.println("Volume: " + volume(s));
        System.out.println("Luas Permukaan: " + luasPermukaan(s));
    }
}

