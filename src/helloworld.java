
import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {

     //Task 4
        // in miles

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you distance:");
        float distance= sc.nextFloat();

        System.out.println("Pleas enter hours:");
        int hour = sc.nextInt();

        System.out.println("Pleas enter minutes:");
        int minute = sc.nextInt();

        System.out.println("Pleas enter seconds:");
        int seconds = sc.nextInt();
        float time = hour + minute + seconds;



        System.out.println("Your speed in km will be :"  + distance/time);

        System.out.println("Your speed in miles will be:" + distance/time );

        System.out.println("Your speed in meters will be :" + distance/time);





     // Task 5


     System.out.println("Enter first number :");

     int first = sc.nextInt();

        System.out.println("Enter second number :");
        int second = sc.nextInt();

        System.out.println("The sum will be :"+ (first + second));


        System.out.println("The difference is :"+ (first-second) );

        System.out.println("The average :"+ (first+second) /2);

        System.out.println("The product of two :"+ (first*second));

        System.out.println("The distance of two :"+ Math.abs (first-second));


        // Task 6

        System.out.println("Enter first number :");
        int first1 = sc.nextInt();

        System.out.println("Enter second number :");
        int second1 = sc.nextInt();

        System.out.println("Number one is :"+ (first1 + 1) + " Number two is :"+ (second1 - 1));










































    }
     }

