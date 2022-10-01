import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        {

            // switch

            int number = 2;
            switch (number) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                default:
                    System.out.println("None was found");

            }

            // ask user to enter a char and write java code to find out if the char is
            // vowel or constant
            // Aa Ee Uu Oo Ii

            System.out.println("Enter a char: ");
            char c = sc.next().charAt(0);

            switch (c) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'u':
                case 'U':
                case 'o':
                case 'O':
                case 'i':
                case 'I':
                    System.out.println(c + "is a vowel");
                    break;
                default:
                    System.out.println(c + "is not a vowel");
            }

            // ask user to enter a number between 1-7
            // and write java code (switch) to print
            // 1 for monday and 2 for the next and etc.
            // default invalid number


            System.out.println("Enter a number between 1-7: ");
            int week = sc.nextInt();
            switch (week) {
                case 1:
                    System.out.println("Monday_not_a_fun_day");
                    break;
                case 2:
                    System.out.println("Tuesday_little_fun_day");
                    break;
                case 3:
                    System.out.println("Just_Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday_is_a_little_Friday");
                    break;
                case 5:
                    System.out.println("TGIF");
                    break;
                case 6:
                    System.out.println("Happy_Shabat_yall");
                    break;
                case 7:
                    System.out.println("Sunday_fun_day_finally");
                    break;
                default:
                    System.out.println(week + "Sorry I don't understand this number");

            }

            // ask user to enter a number between 1-12
            // if number is 12 1 or 2 print winter
            // if 3 4 5 is spring
            // 6 7 8 summer
            // 9 10 11 fall

            System.out.println("Enter a number between 1-12: ");
            int seasons = sc.nextInt();
            switch (seasons) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Winter brrrr");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring nicee");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer breeze");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Fall");
                    break;
                default:
                    System.out.println(seasons + "Sorry not available");
            }

            //ask user their grade , a excellent b great c okay
            // d you can do better f fail
            // if none incorrect grade

            System.out.println("Enter your grade: ");
            char g = sc.next().charAt(0);
            switch (g) {
                case 'a':
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Great!");
                    break;
                case 'c':
                case 'C':
                    System.out.println("Okay!");
                    break;
                case 'd':
                case 'D':
                    System.out.println("Bad");
                    break;
                case 'f':
                case 'F':
                    System.out.println("Fail!");
                    break;
                default:
                    System.out.println(g + " is not a valid grade");
            }
        }








    }
 }