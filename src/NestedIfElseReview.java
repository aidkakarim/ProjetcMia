import java.util.Scanner;

public class NestedIfElseReview {

    public static void main(String[] args) {

        String username = "Admin";
        String password = "admin123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username :");
        String usernameFromUser = scanner.nextLine();
        if (usernameFromUser.equals (username)) {
            System.out.println("Enter password :");
            String passwordFromUser = scanner.nextLine();

            if (passwordFromUser.equals(password)) {
                System.out.println("Login successful");
            }else {
                    System.out.println("Login failed");
                }
            } else {
                System.out.println("Invalid username ");
            }

        //ask user to enter a number between 1-4
        //if number is not between 1-4 print invalid number
        // if number is between 1-4 , if 1 spring, if 2 summer,
        // if 3 autumn, if 4 winter

        System.out.println("Enter a number from 1-4");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 4) {
            if (number == 1) {
                System.out.println("Spring"); //spring
              if (number == 2) {
                System.out.println("Summer"); //summer
                } else if (number == 3) {
                System.out.println("Autumn"); //autumn
                }
            else if (number == 4) {
                System.out.println("Winter"); //winter
                }else{
                System.out.println("Invalid number");
            }}
        }

















        }



    }


