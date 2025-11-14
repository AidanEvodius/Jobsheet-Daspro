public class Bioskop08 {
    public static void main(String[] args) {
        String[][] penonton = new String[8][7];
        penonton[0][0] = "Aysel";
        penonton[0][1] = "Faran";
        penonton[0][2] = "Vito";
        penonton[0][3] = "Fathan";
        penonton[0][4] = "Matthew";
        penonton[0][5] = "Nina";
        penonton[0][6]= "Alban";
        penonton[1][0] = "Ahmad";
        penonton[1][1] = "Arif";
        penonton[1][2] = "Oribel";
        penonton[1][3] = "Erisya";
        penonton[1][4] = "Aaron";
        penonton[1][5] = "Gabriel";
        penonton[1][6]= "Kaibah";
        penonton[2][0] = "Kamal";
        penonton[2][1] = "Nayaka";
        penonton[2][2] = "Azka";
        penonton[2][3] = "Hammam";
        penonton[2][4] = "Yefario";
        penonton[2][5] = "Gevin";
        penonton[2][6]= "Safdar";
        penonton[3][0] = "Revi";
        penonton[3][1] = "Revan";
        penonton[3][2] = "Daffa";
        penonton[3][3] = "Haikal";
        penonton[3][4] = "Reyhan";
        penonton[3][5] = "Adithya";
        penonton[3][6]= "Kaibah";
        penonton[4][0] = "Emha";
        penonton[4][1] = "Akhdan";
        penonton[4][2] = "Aldo";
        penonton[4][3] = "Vincentius";
        penonton[4][4] = "Joshua";
        penonton[4][5] = "Kenneth";
        penonton[4][6]=  "Farhat";
        penonton[5][0] = "Axel";
        penonton[5][1] = "Alex";
        penonton[5][2] = "Danang";
        penonton[5][3] = "Gregorius";
        penonton[5][4] = "Nadhif";
        penonton[5][5] = "Gabriel Surya";
        penonton[5][6] = "Jonathan";
        penonton[6][0] = "Rozi";
        penonton[6][1] = "Timo";
        penonton[6][2] = "Darren";
        penonton[6][3] = "Miguel";
        penonton[6][4] = "Fakri";
        penonton[6][5] = "Naufal";
        penonton[6][6] = "Hafizh";
        penonton[7][0] = "Dimas";
        penonton[7][1] = "Bintang Bagas";
        penonton[7][2] = "Agung";
        penonton[7][3] = "Agris";
        penonton[7][4] = "Toriq";
        penonton[7][5] = "Marvel";
        penonton[7][6] = "Faisal";

        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.print(penonton[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Jumlah baris: " + penonton.length);
        System.out.println("Jumlah kolom per baris: " + penonton[0].length);
    } 

}
