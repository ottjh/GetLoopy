import java.util.Random;

public class DieRollar
{
    public static void main(String[] args)
    {
        //Have to declare & initialize the variables and ensure they do not equal each other at the start
        //Set up the top of the table
        //Make a while loop that ends when all variables equal each other
        //Print with printf

        Random rnd = new Random();
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int rollNum = 0;
        int dieSum = 0;

        //Setting up the table
        System.out.println("Roll   Die1  Die2  Die3  Sum");
        System.out.println("_____________________________");

        //now for the loop
        while ((die1 != die2) && (die2 != die3))
        {
            rollNum++;
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            dieSum = die1 + die2 + die3;

            System.out.printf("%-5d %4d %4d %4d %4d\n", rollNum, die1, die2, die3, dieSum);
        }
    }
}
