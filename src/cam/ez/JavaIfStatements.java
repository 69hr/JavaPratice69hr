package cam.ez;

import java.util.Scanner;
@SuppressWarnings("ALL")
public class JavaIfStatements
{
    public static void main(String[] args)
    {
        trueMethod();

        Scanner sixnine = new Scanner(System.in);

        System.out.println("who is your favorite number");

        int cam = sixnine.nextInt();

        System.out.println(cam);

        if( cam >= 8 && cam <= 800) //you can also just put true
        {
            System.out.println("chad");
        }


    }

    public static void trueMethod()
        {
            Scanner camer = new Scanner(System.in);
            System.out.println("what is your favorite decimal");
            double ezzmode = camer.nextDouble();
            System.out.println(ezzmode);
            if (true)
            {
                System.out.println("your a based nn");
            }

        }

}


