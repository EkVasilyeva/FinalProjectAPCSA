/**
 * Write a description of class challenge3 here.
 *
 * @author (Kate V.)
 * @version (May 28th, 2020)
 */
import java.util.Scanner;
public class challenge3
{
    public static void main()
    {
       System.out.println("The website tells you to contact Thomas, and he will tell you what to do.\nYou are calling him, and he asks: “What is one thing you cannot do with for each loop?\nType one scenario that you cannot use for each loop for.");
       Scanner someScanner = new Scanner(System.in);
       String answer = someScanner.nextLine();
       boolean isTrue = false;
       while(answer.indexOf("remove") == -1 && answer.indexOf("change") == -1)
       {
           if(answer.equals("exit"))
           {
               System.exit(1);
           }
           else if(answer.equals("help"))
            {
                if(Hints.getnumOfHints() == 0)
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    answer = someScanner.nextLine();
                }
                else
                {
                    System.out.println("Can you use it to remove or change elements in the Array or Array List?");
                    Hints.numOfHints--;
                    answer = someScanner.nextLine();
                }
            }
           else
           {
               System.out.println("Wrong answer. Try again!");
               answer = someScanner.nextLine();
           }
       }
       System.out.println("Thomas thanks you for your help.\nHe was in the middle of the test, so you helped him raise his grade :)\n(Note for a player: Remember, cheating is bad kiddos!)");
    }
    
}
