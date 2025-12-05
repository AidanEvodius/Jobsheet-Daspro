public class Kuis8Aidan {
    public static void main(String[] args) {    
        String[] studio8 = {"Reguler", "Dolby Atmos", "IMAX", "Premiere", "Luxury Suite"};

        int[][] penjualan8 = {
             {12, 18, 14},  // Reguler
                {9, 11, 10},   // Dolby Atmos
                {8, 12, 15},   // IMAX
                {7, 9, 8},     // Premiere
                {5, 7, 6}      // Luxury Suite
        } ;

        int[] harga8 = {40000, 40000, 70000, 70000, 70000};
        String[] hari8 = {"Senin", "Sabtu", "Minggu"};

        // total tiket perhari (SOAL A)

        System.out.println("=== total tiket terjual setiap hari ===");
         for (int h = 0; h < 3; h++) {
            int total = 0;
            for (int s = 0; s < studio8.length; s++) {
                total += penjualan8[s][h];
            }
            System.out.println(hari8[h] + " = " + total + " tiket");
        }

        // Rata -- rata penjualan tiket pada hari sabtu (SOAL B)
        int rataSabtu8 = 0;
        for (int s = 0; s < studio8.length; s++) {
            rataSabtu8 += penjualan8[s][1];
        }
        int rataSabtu = rataSabtu8 / studio8.length;

        System.out.println("\n=== Rata-rata Penjualan Hari Sabtu ===");
        System.out.println("Rata-rata = " + rataSabtu + " tiket");

        // Total pemasukkan 3 hari (SOAL C)
        int totalPemasukkan8 = 0;
        for (int s = 0; s < studio8.length; s++) {
            for (int h = 0; h < 3; h++) {
                totalPemasukkan8 += penjualan8[s][h] * harga8[s];
            }
        }

        System.out.println("\n=== Total Pemasukkan 3 Hari ===");
        System.out.println("Total Pemasukkan = Rp " + totalPemasukkan8);

        // Tipe studio & hari dengan penjualan tertinggi (SOAL D)

        int maxtiket8 = -1 ;
        String studiomax8 = "" ;
        String harimax8 = "" ;
          for (int s = 0; s < studio8.length; s++) {
            for (int h = 0; h < 3; h++) {
                if (penjualan8[s][h] > maxtiket8) {
                    maxtiket8 = penjualan8[s][h];
                    studiomax8 = studio8[s];
                    harimax8 = hari8[h];
                }
            }
        }

        System.out.println("\n=== Penjualan Tiket Tertinggi ===");
        System.out.println("Studio : " + studiomax8);
        System.out.println("Hari   : " + harimax8);
        System.out.println("Tiket  : " + maxtiket8 + " tiket");
          


        
    }
    
}
