import java.util.Arrays;

public class TDarrays{
    public static void main(String[] args) {
        int[][] grades = new int[3][4];
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        grades[1][0] = 62;
        grades[1][1] = 64;
        grades[1][2] = 68;
        grades[1][3] = 66;

        grades[2][0] = 82;
        grades[2][1] = 84;
        grades[2][2] = 88;
        grades[2][3] = 86;
        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));
    }
}