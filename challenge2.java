
/**
 * Write a description of class challenge2 here.
 *
 * @author (Kate V.)
 * @version (May 28th, 2020)
 */
import java.util.Scanner;
public class challenge2
{
    public static void main()
    {
        System.out.println("You are going to a given address and find this message to decrypt:\nYKILQPANOYEAJYA.YKI\nand you know that description relates to -4 (not the message itself). Type your decrypted message here:");
        Scanner someScanner = new Scanner(System.in);
        String answer = someScanner.nextLine();
        while(answer.indexOf("COMPUTERSCIENCE.COM") == -1 && answer.indexOf("computerscience.com") == -1)
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
                    System.out.println("What is a study of processes that interact with data and that can be represented as data in the form of programs? That’s the part of the URL that is being asked");
                    Hints.numOfHints--;
                    answer = someScanner.nextLine();
                }
            }
            else
            {
                System.out.println("You are going to that website, but it tells you that you got stuck since the answer is incorrect. Try again!");
                answer = someScanner.nextLine();
            }
        }
        System.out.println("When you go to that website, you get the name of your very good friend from high school Thomas!");
    }
  }
