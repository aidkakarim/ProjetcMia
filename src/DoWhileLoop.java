import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
        i++;    }


        i = 1;

        // loop run the command and then executes if true

        do {
            System.out.println(i);
            i++;
        } while(i <= 10);

        i = 10;

        do {
            System.out.println("Aida");
            i++;
        }while ( i<20);

        //ask user to enter a number
        //print x number your name


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();
        int start = 1;
        do {
            System.out.println("Aida");
            start++;
        }while (start <= num);

        // ask user number between 5-10 print you got it

        i = 1;
        while (i <= 3){
            System.out.println("Enter a number :");
            int number = sc.nextInt();
            if(number >=5 && number <= 10){
                System.out.println("You got it");
                break;
            }else {
                i++;
                System.out.println("Try again");
            }}
            if (i==4);{
            System.out.println("Game over");
        }








    }

    }
