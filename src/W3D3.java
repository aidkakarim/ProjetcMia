
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class W3D3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Whats the weather outside?");
        float temp = sc.nextFloat();

        if (temp > 30) {
            System.out.println("go to the beach and enjoy");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("wear a t shirt");
        } else if (temp >= 15 && temp < 20) {
            System.out.println("wear a jacket");
        } else if (temp < 15) {
            System.out.println("wear a coat");
        }


        System.out.println("What year you were born?");
        int yob = sc.nextInt();

        if (yob >= 1946 && yob <= 1964) {
            System.out.println("You are A Baby Boomer");
        } else if (yob >= 1965 && yob <= 1980) {
            System.out.println("You are a X");
        } else if (yob >= 1981 && yob <= 1996) {
            System.out.println("You are millennial");
        } else if (yob >= 1997 && yob <= 2009) {
            System.out.println("You are Z");
        } else if (yob >= 2010) {
            System.out.println(" You are Alpha");
        } else {
            System.out.println("Incorrect value");
        }


        System.out.println("What year are you born?");
        int year = sc.nextInt();
        int age = 2022 - year;

        if (age >= 21) {
            System.out.println("you are good to consume alcohol");
        } else if (age < 21 && age > 0) {
            System.out.println(" No alcohol for you");
        } else {
            System.out.println("invalid");
        }




    }
        }














