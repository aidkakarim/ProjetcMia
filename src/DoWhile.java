import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int i=0;

        do {
            System.out.println(i);
            System.out.println("DoWhile is being executed");
            i++;
        } while(i<5); // output 0, 1 ,2, 3, 4



        // Task do while print your name 20 times

        int a= 21;
        do {
        System.out.println("Aida Karimova");
            System.out.println(a);
            a++;}
        while(a<=41);

        // The same way to print your name 20 times
        for(int k = 21; k <41; k++) {
            System.out.println("Aida Karimova");
        }

        // Task

       Scanner scanner = new Scanner (System.in);

        System.out.println("Pleas guess my number between 0 and 20:");

        int userInput = scanner.nextInt();

        for (int o =0; o<= 20; o++) {
            if (o == userInput) {
                System.out.println(o+ " is the number you guessed");
            }
        }
























    }
}
