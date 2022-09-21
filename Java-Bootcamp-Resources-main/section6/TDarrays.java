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

        for (int j = 0; j < grades.length; j++) {
            for (int i = 0; i < grades[0].length; i++) {      
                System.out.print("\t" + grades[j][i]);
            }   
            System.out.print("\n");
        }
        

        // for (int j = 0; j < grades[1].length; j++) {
        //     System.out.print(grades[0][j]);
        // }
        // System.out.println("\n");

        // for (int j = 0; j < grades[2].length; j++) {
        //     System.out.print(+ grades[0][j]);
        // }
        
    }
}