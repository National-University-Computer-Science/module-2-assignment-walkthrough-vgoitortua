// Add Java imports

import java.util.Scanner;
import java.util.ArrayList; // used for arrays to grow and shrink 
import java.util.Collections; // for list or sets, methods for sorting, reversing and shuffling. (traverse through data)

public class TemperatureConverter {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperatureFahrenheit = new ArrayList <> ();

        System.out.println("Enter temperature values in Celsius (Type 'end' to finish): "); 

        while (scanner.hasNextDouble()) { //while loops works while condition is true
            double tempCelsius = scanner.nextDouble();
            double tempFahrenheit = convertCelsiusToFahrenheit(tempCelsius); 
            temperatureFahrenheit.add(tempFahrenheit);   

        }

        //Skip the non numeric input that ends the loop
        scanner.next();

        if(!temperatureFahrenheit.isEmpty()) {
            double average = temperatureFahrenheit.stream().mapToDouble(val -> val).average().orElse(0.0);
            double min = Collections.min(temperatureFahrenheit);
            double max = Collections.max(temperatureFahrenheit);
            double range = max - min; 

            System.out.println("Average temperatures in Fahrenheit: " + average);
            System.out.println("Lowest temperature in Fahrenheit:"); 
            System.out.println("Highest temperature in Fahrenheit: " + min);
        } else {
            System.out.println("temperatures were entered.");
        }

        scanner.close();

        public static double convertCelsiusToFahrenheit(double tempCelsius) {
            return (tempCelsius * 9 / 5) + 32;
        }

        }
}

