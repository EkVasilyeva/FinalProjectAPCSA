/**
 * Write a description of class challenge9 here.
 *
 * @author (Kate V.)
 * @version (June 1st, 2020)
 */
import java.util.Scanner;
public class challenge9
{
    public static void main()
    {
        System.out.println("You are looking at your plants, and while you stared at them, you are getting a notification. It is from Cicada: \n“I know that you just stared at plants, so I think that you are interested in biology. To prove it and move to the next round, answer this question correctly. Can you turn your cat into a diamond?” \nType yes or no");
        Scanner q = new Scanner(System.in);
        String ans = q.nextLine();
        while(!ans.equals("yes"))
        {
            if(ans.equals("exit"))
            {
                System.exit(1);
            }
            else if(ans.equals("help"))
            {
                if(Hints.getnumOfHints() == 0)
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    ans = q.nextLine();
                }
                else
                {
                    System.out.println("It sounds crazy, but it is a true fact. The more you know…");
                    Hints.numOfHints--;
                    ans = q.nextLine();
                }
            }
            else 
            {
                System.out.println("Another message: “You are losing your chances of moving on in this journey. Try again”");
                ans = q.nextLine();
            }
        }
        System.out.println("Another message: “Wow, you really knew that, which is a little bit weird, but okay. Good job”");
    }
}
