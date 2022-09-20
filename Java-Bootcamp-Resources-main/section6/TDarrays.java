import java.util.Arrays;

public class TDarrays{
    public static void main(String[] args) {
        int[][] grades = {
            {72,74,78,76},
            {62,64,68,66},
            {82,84,88,86}
        };
        
        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));
    }
}