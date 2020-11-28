package cam.ez;

import java.util.Scanner;

public class StringInput
{
    public static void main(String[] args){

        String pvp = "69hr is a pvp god";

        System.out.println(pvp);

        Scanner scan = new Scanner(System.in);

        System.out.println("what is your IGN?");

        String question1 = scan.nextLine();

        System.out.println("can you code?");

        String question2 = scan.nextLine();

        System.out.println("what client do you use?");

        String question3 = scan.nextLine();

        System.out.println("are you a pvp god like 69hr?");

        String question4 = scan.nextLine();

        System.out.println("who owns you?");

        String question5 = scan.nextLine();

        System.out.println("here are your answers!");

        System.out.println(question1);

        System.out.println(question2);

        System.out.println(question3);

        System.out.println(question4);

        System.out.println(question5);
        //this will print out our response to the questions.

    }
}
/*Here is the code for how to get string
from a user in java! I walk through an
example of how to get string user input
in java by asking for an application.
Getting user input can be tricky to understand
if you're new to programming but fear not! It's
not too bad :) If you followed along, congrats! You learned-by-doing!
*/

