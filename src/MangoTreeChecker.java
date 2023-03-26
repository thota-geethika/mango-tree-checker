import java.util.ArrayList;
import java.util.Scanner;

public class MangoTreeChecker {
    public static void main(String[] args) {

        // Taking input from user
        int numberOfRows;
        int numberOfColumns;
        int treeNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        numberOfRows = scan.nextInt();
        System.out.println("Enter number of columns: ");
        numberOfColumns = scan.nextInt();
        System.out.println("Enter the tree number which is to be checked whether it's mango tree or not: ");
        treeNumber = scan.nextInt();


        //logic
        if(treeNumber > numberOfRows*numberOfColumns)
        {
            System.out.println("Entered tree number doesn't exist. Please enter a valid tree number.");
        }
        else
        {
            ArrayList<Integer> mangoTreeNumbers = new ArrayList<>();
            for(int iterator=1;iterator<=numberOfRows;iterator++)
            {
                mangoTreeNumbers.add(iterator);
                if(iterator<numberOfRows) {
                    mangoTreeNumbers.add((numberOfRows * iterator)+ 1);
                }
                if(iterator > 1) {
                    mangoTreeNumbers.add(numberOfRows * iterator);
                }
            }

            //To check whether the entered tree number is a mango tree or not
            if(mangoTreeNumbers.contains(treeNumber))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}