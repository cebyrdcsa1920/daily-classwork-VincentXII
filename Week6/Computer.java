public class Computer
{
    private String CPU;
    private String GPU;
    private double ghz;
    private int ram;
    private boolean works

    public Computer()
    {
        CPU = "AMD Threadripper 6009X";
        GPU = "NVIDIA GeForce 2003";
        ghz = 2.4;
        ram = 16;
        works = true
    }

    public Computer(String CPU, String GPU, double ghz, int ram, boolean works)
    {
        this.CPU = CPU;
        this.GPU = GPU;
        this.ghz = ghz;
        this.ram = ram;
        this.works = works;
    }

    public void BootUp()
    {
        System.out.println("BRRRRRRRRRRRRRRRRRRRR");
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZ");
        System.out.println("ok");
    }

}