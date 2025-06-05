
import pkg1.*;
import java.util.*;

public class packageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        sc.close();
    }
}