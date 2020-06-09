/**
 * Write a description of class challenge6 here.
 *
 * @author (kate V.)
 * @version (June 1st, 2020)
 */
import java.util.Scanner;
public class challenge6
{
    public static void main()
    {
        System.out.println("After practice, you are walking home with your friend, and your friend says: “Noo! I just got hacked!”. \nYou are trying to educate him, but to make sure you will teach him the right things about cybersecurity in the cyber world, answer correctly those questions:");
        
        
        System.out.println("What does the acronym CIA in cyber security stands for?");
        Scanner questions = new Scanner(System.in);
        String oneAns = questions.nextLine();
        boolean isCorrect = false;
        while(isCorrect != true)
        {
            if(oneAns.indexOf("confidentiality") != -1 && oneAns.indexOf("integrity") != -1 && oneAns.indexOf("availability") != -1)
            {
                isCorrect = true;
            }
            else if(oneAns.equals("exit"))
            {
                System.exit(1);
            }
            else if(oneAns.equals("help"))
            {
                if(Hints.getnumOfHints() != 0)
                {
                    System.out.println("C is for Confidentiality");
                    Hints.numOfHints--;
                    oneAns = questions.nextLine();
                }
                else
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    oneAns = questions.nextLine();
                }
            }
            else if(oneAns.indexOf("confidentiality") == -1 || oneAns.indexOf("integrity") == -1 || oneAns.indexOf("availability") == -1)
            {
                System.out.println("Sorry, but the answer is incorrect. Try again!");
                oneAns = questions.nextLine();
            }
        }
        System.out.println("Do hackers just hack others? type yes or no");
        String twoAns = questions.nextLine();
        while(!twoAns.equals("no"))
        {
            if(twoAns.equals("exit"))
            {
                System.exit(1);
            }
            else if(twoAns.equals("help"))
            {
                if(Hints.getnumOfHints() != 0)
                {
                    System.out.println("Try to think of a word “hacker” in a positive way. They are finding bugs (computer bugs/errors) in the system that actually helps to make something without bugs and errors");
                    Hints.numOfHints--;
                    twoAns = questions.nextLine();
                }
                else
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    twoAns = questions.nextLine();
                }
            }
            else 
            {
                System.out.println("Sorry, but the answer is incorrect. Try again!");
                twoAns = questions.nextLine();
            }
        }
        System.out.println("What are the 3 main types of cyber attacks?");
        String threeAns = questions.nextLine();
        boolean isAll = false;
        while(isAll != true)
        {
            if(threeAns.indexOf("malware") != -1 && threeAns.indexOf("ransomware") != -1 && threeAns.indexOf("phishing") != -1)
            {
                isAll = true;
            }
            else if(threeAns.equals("exit"))
            {
                System.exit(1);
            }
            else if(threeAns.equals("help"))
            {
                if(Hints.getnumOfHints() != 0)
                {
                    System.out.println("They are also the most common ones, like “Phishing” attacks");
                    Hints.numOfHints--;
                    threeAns = questions.nextLine();
                }
                else
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    threeAns = questions.nextLine();
                }
            }
            else if(threeAns.indexOf("malware") == -1 || threeAns.indexOf("ransomware") == -1 || threeAns.indexOf("phishing") == -1)
            {
                System.out.println("Sorry, but the answer is incorrect. Try again!");
                threeAns = questions.nextLine();
            }
        }
        System.out.println("Is it a good idea to keep all your passwords on your phone digitally? type yes or no");
        String fourAns = questions.nextLine();
        while(!fourAns.equals("no"))
        {
            if(fourAns.equals("exit"))
            {
                System.exit(1);
            }
            else if(fourAns.equals("help"))
            {
                if(Hints.getnumOfHints() != 0)
                {
                    System.out.println("Think again, if someone will hack your phone, they can see all your files. All!");
                    Hints.numOfHints--;
                    fourAns = questions.nextLine();
                }
                else
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    fourAns = questions.nextLine();
                }
            }
            else 
            {
                System.out.println("Sorry, but the answer is incorrect. Try again!");
                fourAns = questions.nextLine();
            }
        }
        System.out.println("Does cyber insurance exist? type yes or no");
        String fiveAns = questions.nextLine();
        while(!fiveAns.equals("yes"))
        {
            if(fiveAns.equals("exit"))
            {
                System.exit(1);
            }
            else if(fourAns.equals("help"))
            {
                if(Hints.getnumOfHints() != 0)
                {
                    System.out.println("Sounds crazy, but it is a thing");
                    Hints.numOfHints--;
                    fiveAns = questions.nextLine();
                }
                else
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    fiveAns = questions.nextLine();
                }
            }
            else
            {
                System.out.println("Sorry, but the answer is incorrect. Try again!");
                fiveAns = questions.nextLine();
            }
        }
        System.out.println("Is it a good idea to click on sketchy links and download files from unknown and unexpected emails? type yes or no");
        String sixAns = questions.nextLine();
        while(!sixAns.equals("no"))
        {
            if(sixAns.equals("exit"))
            {
                System.exit(1);
            }
            else if(sixAns.equals("help"))
            {
                if(Hints.getnumOfHints() != 0)
                {
                    System.out.println("That type of attacks called a Phishing attack");
                    Hints.numOfHints--;
                    sixAns = questions.nextLine();
                }
                else
                {
                    System.out.println("Sorry, but you ran out of hints. Good luck!");
                    sixAns = questions.nextLine();
                }
            }
            else
            {
                System.out.println("Sorry, but the answer is incorrect. Try again!");
                sixAns = questions.nextLine();
            }
        }
        System.out.println("You are explaining all the rules and basics of cybersecurity and how can you minimize those types of problems. \nYou are helping your friend, they thank you and you go home.");
        }
    }
