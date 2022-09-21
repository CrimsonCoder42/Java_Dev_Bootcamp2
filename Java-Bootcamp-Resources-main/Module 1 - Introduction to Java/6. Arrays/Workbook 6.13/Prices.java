import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.

        double[][] pricingTable = new double[3][5];
        

        // Task 2 - Populate your 2D array with values from the table (see article)

        pricingTable[0][0] = 12.99;
        pricingTable[0][1] = 8.99;
        pricingTable[0][2] = 9.99;
        pricingTable[0][3] = 10.49;
        pricingTable[0][4] = 11.99;

        pricingTable[1][0] = 0.99;
        pricingTable[1][1] = 1.99;
        pricingTable[1][2] = 2.49;
        pricingTable[1][3] = 1.49;
        pricingTable[1][4] = 2.99;

        pricingTable[2][0] = 8.99;
        pricingTable[2][1] = 7.99;
        pricingTable[2][2] = 9.49;
        pricingTable[2][3] = 9.99;
        pricingTable[2][4] = 10.99;


        // Task 3 - Print the prices for each department. See the article for the expected output.  
        System.out.println("Baking: " + Arrays.toString(pricingTable[0]));
        System.out.println("Beverage: " + Arrays.toString(pricingTable[1]));
        System.out.println("Cereals: " + Arrays.toString(pricingTable[2]));

    }
}