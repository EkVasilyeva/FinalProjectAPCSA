/**
 * Write a description of class challenge4 here.
 *
 * @author (Kate V.)
 * @version (June 1st, 2020)
 */
import java.util.Scanner;
public class challenge4
{
    public static void main()
    {
        System.out.println("As you finish a call with Thomas, you see a poster that challenges you to test your knowledge in Java.\n You decide to do it since it’s also has a Cicada logo, which means it’s one of their challenges.");
        
        System.out.println("Is String immutable? type yes or no");
        Scanner questions = new Scanner(System.in);
            String oneAns = questions.nextLine();
            while(!oneAns.equals("yes"))
            {
                 if(oneAns.equals("exit"))
                {
                    System.exit(1);
                }
                else if(oneAns.equals("help"))
                {
                    if(Hints.getnumOfHints() != 0)
                    {
                        System.out.println("Can you change the String and characters in that String?");
                        Hints.numOfHints--;
                        oneAns = questions.nextLine();
                    }
                    else
                    {
                        System.out.println("Sorry, but you ran out of hints. Good luck!");
                        oneAns = questions.nextLine();
                    }
                }   
                else
                {
                    System.out.println("Sorry, but the answer is incorrect. Try again!");
                    oneAns = questions.nextLine();
                }
            }
            System.out.println("Can you change 1-D Array or 2-D Array? Type yes or no");
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
                        System.out.println("Can you remove and change the number of “slots” in an Array? (Not Array List)");
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
            System.out.println("What is the data type of a number would you get when you divide (/) int by a double?");
            String threeAns = questions.nextLine();
            while(!threeAns.equals("double"))
            {
                if(threeAns.equals("exit"))
                {
                    System.exit(1);
                }
                else if(threeAns.equals("help"))
                {
                    if(Hints.getnumOfHints() != 0)
                    {
                        System.out.println("What data type you get when you divide 2 doubles? Same thing here");
                        Hints.numOfHints--;
                        threeAns = questions.nextLine();
                    }
                    else
                    {
                        System.out.println("Sorry, but you ran out of hints. Good luck!");
                        threeAns = questions.nextLine();
                    }
                }
                else
                {
                    System.out.println("Sorry, but the answer is incorrect. Try again!");
                    threeAns = questions.nextLine();
                }
            }
            System.out.println("Can you call a static method without writing a class’s name before it? type yes or no");
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
                        System.out.println("Think of what word “static” in Java means and how is it different from a non-static class");
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
            System.out.println("What are 3 main pieces of codes a Java Class generally have?");
            String fiveAns = questions.nextLine();
            boolean isCorrect = false;
            while(isCorrect != true)
            {
                if(fiveAns.indexOf("fields") != -1 && fiveAns.indexOf("constructor") != -1 && fiveAns.indexOf("methods") != -1)
                {
                    isCorrect = true;
                }
                else if(fiveAns.equals("exit"))
                {
                    System.exit(1);
                }
                else if(fiveAns.equals("help"))
                {
                    if(Hints.getnumOfHints() != 0)
                    {
                        System.out.println("One of them is fields");
                        Hints.numOfHints--;
                        fiveAns = questions.nextLine();
                    }
                    else
                    {
                        System.out.println("Sorry, but you ran out of hints. Good luck!");
                        fiveAns = questions.nextLine();
                    }
                }
                else if(fiveAns.indexOf("fields") == -1 || fiveAns.indexOf("constructor") == -1 || fiveAns.indexOf("methods") == -1)
                {
                    System.out.println("Sorry, but the answer is incorrect. Try again!");
                    fiveAns = questions.nextLine();
                }
                
            }
            System.out.println("What method do you use to compare 2 Strings?");
            String sixAns = questions.nextLine();
            while(sixAns.indexOf("equals") == -1)
            {
                if(sixAns.equals("exit"))
                {
                    System.exit(1);
                }
                else if(sixAns.equals("help"))
                {
                    if(Hints.getnumOfHints() != 0)
                    {
                        System.out.println("Look at Java Quick Reference Guide");
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
            System.out.println("How does a method called, that just returns a private field?");
            String sevenAns = questions.nextLine();
            while(sevenAns.indexOf("accessor") == -1)
            {
                if(sevenAns.equals("exit"))
                {
                    System.exit(1);
                }
                else if(sevenAns.equals("help"))
                {
                    if(Hints.getnumOfHints() != 0)
                    {
                        System.out.println("What you do, is accessing the field. The name of that method comes from the word “access”");
                        Hints.numOfHints--;
                        sevenAns = questions.nextLine();
                    }
                    else
                    {
                        System.out.println("Sorry, but you ran out of hints. Good luck!");
                        sevenAns = questions.nextLine();
                    }
                }
                else
                {
                    System.out.println("Sorry, but the answer is incorrect. Try again!");
                    sevenAns = questions.nextLine();
                }
            }
            System.out.println("Cool! \nAfter sending all your answers, you are getting a message from your buddy, saying to go to a school field for practice.");
        } 
    }
