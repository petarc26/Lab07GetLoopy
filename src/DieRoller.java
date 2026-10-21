import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String again;
        do {
            int die1;
            int die2;
            int die3;
            int sum;
            int rollNum = 0;
            System.out.printf("%-8s %-8s %-8s %-8s %-8s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------");
            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;

                rollNum++;
                sum = die1 + die2 + die3;

                System.out.printf("%-8d %-8d %-8d %-8d %-8d%n",
                        rollNum, die1, die2, die3, sum);

            } while (die1 != die2 || die2 != die3);

            System.out.println("Triple rolled!");
            System.out.println("Total rolls: " + rollNum);

            System.out.print("Would you like to roll again? (Y/N): ");
            again = in.nextLine();

        } while (again.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}
