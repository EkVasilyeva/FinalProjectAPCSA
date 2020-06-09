/**
 * Write a description of class challenge8 here.
 *
 * @author (Kate V.)
 * @version (June 1st, 2020)
 */
import java.util.Scanner;
public class challenge8
{
    public static void main()
    {
        System.out.println("After this man leaves, you can finally calm down, but still, feel unsure. \nYou are checking the entire house, and notice that you are safe and no one else is home. \nYou already done with everything, so you try to play some animal crossing on your Nintendo Switch. But...the power is out, and the Switch is not charged! \nYou decide to just lay on your bed and look at the sky. It’s pretty late, so you see stars in the sky, and wondering: “When the sun will die?”. Type your answer as double (the units are billions of years).");
        Scanner q = new Scanner(System.in);
        String ans = q.nextLine();
        String correct = "7.5";
        while (!ans.equals(correct))
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
                    System.out.println("It’s a little bit more than 7");
                    Hints.numOfHints--;
                    ans = q.nextLine();
                }
            }
            else
            {
                System.out.println("You felt like something isn’t right, and you find out that it will die in about 7.5 billion years.");
                return;
            }
        }
        System.out.println("You remember that fact from your astronomy class, and you start thinking about it.");
        return;
     }
}