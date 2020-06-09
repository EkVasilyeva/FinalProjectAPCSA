/**
 * Write a description of class challenge10 here.
 *
 * @author (Kate V.)
 * @version (June 1st, 2020)
 */
import java.util.Scanner;
public class challenge10
{
    public static void main()
    {
        System.out.println("Message: \n“Well, since you know this fact, I’m assuming you also like cats. The final question of the day and to end it on the good note: What are the names of 2 cats that Mr. Barron owns?” \nType your answers without Mr.");
        Scanner q = new Scanner(System.in);
        String answer = q.nextLine();
        boolean found = false;
        while(found != true)
        {
            if(answer.indexOf("Snuggles") != -1 && answer.indexOf("Mischief") != -1)
            {
                found = true;
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
                    answer = q.nextLine();
                }
                else
                {
                    System.out.println("Look at Mr. Barrons Google Classroom posts, you’ll find their names");
                    Hints.numOfHints--;
                    answer = q.nextLine();
                }
            }
            else
            {
                System.out.println("“Dear player, with each of your incorrect answers, you are losing your chances of being eligible to be with us. Try again”");
                answer = q.nextLine();
            }
        }   
        System.out.println(" “Well, good job. You will receive your next message in the morning. Good job. And don’t forget to drink more water!”");
        System.out.println("");
        System.out.println("Note from the programmer/creator: Hello player! I just want to say a huge thank you for trying out my quest. I heard about Cicada 3301 much before joining AP Computer Science A class, and I was always amazed by how they are doing all this. I hope you enjoyed this game! \nIf you would like, you can either write the feedback on this quest or type “exit” to leave the game. \nAnd remember to use your programming skills for good!");
        String feedback = q.nextLine();
        System.exit(1);
    }
}
