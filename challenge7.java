/**
 * Write a description of class challenge7 here.
 *
 * @author (Kate V.)
 * @version (June 1st, 2020)
 */
import java.util.Scanner;
public class challenge7
{
    public static void main()
    {
        System.out.println("You are home, and you hear no one. \nYou are walking to the kitchen, and you hear the door closing and locking. You turn around, and you see an unknown man with lab coat and safety goggles. \nYou realize that you cannot get out unless he lets you out. \nHe asks: “Well, hello player! I’m Dr. Haber, and you will not go anywhere until you answer this question correctly. \nCan you turn carbon into diamonds or no?” \n(Answer yes or no)");
        Scanner someScanner = new Scanner(System.in);
        String answer = someScanner.nextLine();
        while(!answer.equals("yes"))
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
                    System.out.println("Popular science fact that some people find it interesting. Think about how pressure can change the matter");
                    Hints.numOfHints--;
                    answer = someScanner.nextLine();
                }
            }
            else
            {
                System.out.println("He comes to you closer, and you don’t know what he can do. Try again and hurry!");
                answer = someScanner.nextLine();
            }
        }
        System.out.println("“Good, you know some stuff. I’m one of the people from Cicada. Nice to meet you. And remember, we are always watching you!” and leaves.");
    }    
}
