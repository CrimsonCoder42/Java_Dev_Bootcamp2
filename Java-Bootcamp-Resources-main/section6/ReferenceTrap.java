import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        
        // DO NOT SET ARRAY VALUES EQUAL TO EACHOTHER. 
        // Always make sure to create a new array and copy into it.

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

    }
}