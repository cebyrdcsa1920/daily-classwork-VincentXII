public class Computer
{
    private String OS;
    private String cpuModel;
    private String gpuModel;
    private int RAM;
    private double ghz;

    public Computer(String OS, String cpuModel, String gpuModel, int RAM, double ghz)
    {
        this.OS = "Windows 10";
        this.cpuModel = "Intel 9900KFC";
        this.gpuModel = "NVIDIA 2080RTX";
        this.RAM = 16;
        this.ghz = 4.0;

    }
/*
    public Computer()
    {
        OS = "Arch Linux";
        cpuModel = "Intel Core 2 Duo Q2230";
        gpuModel = "Radeon 3200";
        RAM = 2;
        ghz = 1.2;
    }
*/
}