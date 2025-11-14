import java.util.Arrays;
public class Numbers08 {
    public static void main(String[] args) {
        int[][] myNumbers= new int[3][];

        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        myNumbers[0][0] = 10;
        myNumbers[1][1] = 20;
        myNumbers[2][0] = 30;

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

    }

}