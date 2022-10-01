import java.io.StringReader;
import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {


        String Aida = "Karimova"; // Aida is a variable name for Karimova.
        System.out.println("Aida");

        int number = 10; // number is variable for 10
        System.out.println(number);

        int year = 1994;
        System.out.println(year); // year is variable for 1994

        float Iphone = 999.99f;
        System.out.println(Iphone); // Iphone is variable for 999.99f

        System.out.println("I was born in:"+ year +"My last name is:"+ Aida + "And my number is :" + number); // to print variables together

        String city = "Bishkek";
        String state = "NYC";
        int cellPhone = 917;
        float priceForHome = 100099.999f;

        System.out.println("I live in city " + city + " and state " + state +
                " And cell phone number is " + cellPhone + " And the price of home is " + priceForHome);



        // Task to create a tempeature
        Scanner sc = new Scanner (System.in);

        System.out.println("{Pleas enter temp in F");
        float userInput= sc.nextFloat();

        float celsius = (float) ((5 * (userInput - 32.0))/9.0);
        System.out.println("Celsius is " + celsius);














    }




}
