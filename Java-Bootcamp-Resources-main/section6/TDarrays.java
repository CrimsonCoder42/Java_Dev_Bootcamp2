import java.util.Arrays;

public class TDarrays{
    public static void main(String[] args) {
        int[][] grades = {
            {72,74,78,76},
            {62,64,68,66},
            {82,84,88,86}
        };
        
        System.out.println("\tHarry: " + grades[0][0] + " " + grades[0][1] + " " +grades[0][2] + " " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + " " + grades[1][1] + " " +grades[1][2] + " " + grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + " " + grades[2][1] + " " +grades[2][2] + " " + grades[2][3]);
    }
}