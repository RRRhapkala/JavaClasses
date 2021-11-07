
public class Converter
{
    static double CelsiusToFahrenheit(double Celsius)
    {
        return Celsius * 1.8 + 32;
    }
    static double CelsiusToKelvin(double Celsius)
    {
        return Celsius + 273.15;
    }
    static double KelvinToCelsius(double Kelvin)
    {
        return Kelvin - 273.15;
    }
    static double KelvinToFahrenheit(double Kelvin)
    {
        return Kelvin * 1.8 - 240.85;
    }
    static double FahrenheitToCelsius(double Fahrenheit)
    {
        return (Fahrenheit-32)/1.8;
    }
    static double FahrenheitToKelvin(double Fahrenheit)
    {
        return (Fahrenheit-32)/1.8 + 273.15;
    }
}

