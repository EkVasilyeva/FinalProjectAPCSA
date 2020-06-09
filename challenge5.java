/**
 * Write a description of class challenge5 here.
 *
 * @author (Kate V.)
 * @version (June 1st, 2020)
 */
import java.util.*;
public class challenge5
{
    public static void main()
    {
        System.out.println("You and your friend are discussing the physics test that you did today. \nHe is curious and asks you: “Hey since you are saying that you’re so good in physics, answer me this. Can air make shadows?” \nType yes or no");
        
        Scanner someScanner = new Scanner(System.in);
        String ans = someScanner.nextLine().toLowerCase();
        while (!ans.equals("yes"))
        {
            if(ans.equals("no"))
            {
                System.out.println("Try again!");
                ans = someScanner.nextLine();
            }         
            if(ans.equals("exit"))
            {
                System.exit(1);
            }
            else if(ans.equals("help"))
            {
                if(Hints.getnumOfHints() != 0)
                {
                    System.out.println("The answer is opposite of yes (I know it's not a clue, but still");
                    Hints.numOfHints--;
                    ans = someScanner.nextLine();
                }
                else
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    ans = someScanner.nextLine();
                }
            }
        }
        System.out.println("Huh, you are indeed pretty smart, okay!");
        return;
    }
}
