import java.util.Random;
import java.util.Scanner;

public class DieRollar
{
    public static void main(String[] args)
    {
        //Have to declare & initialize the variables and ensure they do not equal each other at the start
        //Set up the top of the table
        //Make a while loop that ends when all variables equal each other
        //Print with printf
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int rollNum = 0;
        int dieSum = 0;
        String done = "n";
        boolean done1 = false;

        //Setting up the table
        System.out.println("Roll   Die1  Die2  Die3  Sum");
        System.out.println("_____________________________");

        //now for the loop
        do
        {
            while ((die1 != die2) || (die2 != die3))
            {
                rollNum++;
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                dieSum = die1 + die2 + die3;

                System.out.printf("%-5d %4d %4d %4d %4d\n", rollNum, die1, die2, die3, dieSum);
            }
            
            System.out.print("Enter [q] to quit: ");
            done = in.nextLine();
            if (done.equalsIgnoreCase("q"))
            {
                done1 = true;
            }
            else
            {
                die1 = 1;
                die2 = 2;
                die3 = 3;
            }
        } while (!done1);
    }
}
