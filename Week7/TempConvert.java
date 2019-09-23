public class TempConvert
{
    private double temperature;
    private boolean isCelsius;

    public TempConvert(double celsius)
    {
        temperature = celsius;
        isCelsius = true;
    }

    public void convertToF
    {
        if(isCelsius)
        {
            temperature = temperature * 9 / 5 + 32;
        }
    }

    public String toString()
    {
        String result = "The current temperature is" + temperature + "degrees";
        if (isCelsius)
        {
            result += "Fahrenheit";
        }
        return result;
    }
}
