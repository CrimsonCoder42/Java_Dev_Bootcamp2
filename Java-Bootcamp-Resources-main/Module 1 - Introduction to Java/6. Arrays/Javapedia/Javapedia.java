import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.

        int figures = scan.nextInt();
        scan.nextLine();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.      
        String[][] figuresArray = new String[figures][3];
         
        //Watch out for the nextLine() pitfall. 
        /* Task 3 
        for (____) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            pick up and store figure's name.   

            System.out.print("\t - Date of birth: ");
            pick up and store figure's birthday.

            System.out.print("\t - Occupation: ");
            pick up and store figure's occupation. 

            System.out.print("\n");

        }
        
        */
        String[] figDetails = {"Name: ", "Date of Birth: ", "Occupation: "};

        for(int i = 0; i < figuresArray.length; i++) {
            System.out.println("Figure " + (i + 1));
            for(int j = 0; j < figuresArray[0].length; j++) {
                System.out.print(figDetails[j]);
                figuresArray[i][j] = scan.nextLine();
                
            }
        }

        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        print2DArray(figuresArray);

        System.out.print("\nWho do you want information on? ");
        String figureInfo = scan.nextLine();  
        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */      
        for (int i = 0; i < figuresArray.length; i++){
            if(figuresArray[i][0].equals(figureInfo)) {
                System.out.println("\t Name: " + figuresArray[i][0]);
                System.out.println("\t Date Of Birth: " + figuresArray[i][1]);
                System.out.println("\t Occupation: " + figuresArray[i][2]);
            } 
        }  

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
           for (int j = 0; j < array[i].length; j++) {
               System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
