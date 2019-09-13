public class Computer
{
    private String CPU;
    private String GPU;
    private double ghz;
    private int ram;

    public Computer()
    {
        CPU = "AMD Threadripper 6009X";
        GPU = "NVIDIA GeForce 2003";
        ghz = 2.4;
        ram = 16;
    }

    public Computer(String CPU, String GPU, double ghz, int ram)
    {
        this.CPU = CPU;
        this.GPU = GPU;
        this.ghz = ghz;
        this.ram = ram;
    }

    public void BootUp()
    {
        System.out.println("BRRRRRRRRRRRRRRRRRRRR");
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZ");
        System.out.println("ok");
    }

}