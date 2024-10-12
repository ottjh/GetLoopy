//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //Task 1
        for (int countUp = 0; countUp < 31; countUp++)
        {
            System.out.print(countUp + " ");
        }

        //Task 2
        System.out.println();
        for (int countDown = 30; countDown > -1; countDown--)
        {
            System.out.print(countDown + " ");
        }

        //Task 3
        System.out.println();
        for (int upThree = 0; upThree < 19; upThree= upThree + 3)
        {
            System.out.print(upThree + " ");
        }

        //Task 4
        System.out.println();
        for (int downTwo = 10; downTwo > -1; downTwo = downTwo - 2)
        {
            System.out.print(downTwo + " ");
        }

        //Task 5 NOT DONE YET JAMES CHANGE THIS TO GET IT RIGHT!
        System.out.println();
        for (int columnControl = 0; columnControl < 5; columnControl++)
        {
            for (int rowControl = 0; rowControl < 5; rowControl++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Task 6

        //Task 7
        System.out.println();
        for (int columnControl = 0; columnControl < 5; columnControl++)
        {
            for (int rowControl = 0; rowControl < 5; rowControl++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}