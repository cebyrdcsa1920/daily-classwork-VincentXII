import java.util.Scanner;

public class ScanChoiceTest
{
    public static void main (String[] args)
    {
        Scanner choice = new Scanner(System.in);
        System.out.println("1 - Utilitie\n 2 - Test");
        String select = choice.nextLine();

        if(select.equals("1"))
        {
            System.out.println("utilty here");
        }
        else if(select.equals("2"))
        {
            System.out.println("testing pattern");
        }
    }
}