/**
 * Write a description of class challenge1 here.
 *
 * @author (Kate V.)
 * @version (May 28th, 2020)
 */
import java.util.Scanner;
public class challenge1
{
    public static void main()
    {
        System.out.println("Since you are at the very beginning, the questions will be easy at first but will get harder as you get farther.");
        System.out.println("You are looking at the picture, and finding in its script this question: ");
        System.out.println("What are two sorts of signals does the brain use to communicate sensation, thoughts, and actions?");
        
        Scanner someScanner = new Scanner(System.in);
        String answer = someScanner.nextLine();
        while (answer.indexOf("electrical") == -1 || answer.indexOf("chemical") == -1)
        {
            if(answer.indexOf("electrical") != -1 && answer.indexOf("chemical") == -1)
            {
                System.out.println("Great! You got electrical, but you are missing the other one. Try again!");
                answer = someScanner.nextLine();
            }
            else if(answer.indexOf("electrical") == -1 && answer.indexOf("chemical") != -1)
            {
                System.out.println("Good! You got chemical, but you are missing the other one. Try again!");
                answer = someScanner.nextLine();
            }
            else if(answer.equals("exit"))
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
                    System.out.println("One of them is electrical. There is 2 of them");
                    Hints.numOfHints--;
                    answer = someScanner.nextLine();
                }
            }
            else 
            {
                System.out.println("Sorry, but none of them are correct. Try again!");
                answer = someScanner.nextLine();
            }
        }
        System.out.println("You are inputting the answer and being notified that your answer is correct!");
    }
}
