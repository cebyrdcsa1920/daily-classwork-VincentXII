public class HelloInput
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Provide Two Words");
        }
        else
        {
        String firstName = args[0];
        String lastName = args[1];
        System.out.println("Hello "+ firstName + " " + lastName);
        }
    }

}