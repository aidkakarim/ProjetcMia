import java.util.Scanner;

public class Satclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas enter your name: ");
        String userName = sc.nextLine();

        String fChar = String.valueOf(userName.charAt(0));
        String lChar = String.valueOf(userName.charAt(userName.length() - 1));

        if (fChar.equals(lChar)) {
            System.out.println(true);
        } else if (!fChar.equals(lChar)) {
                System.out.println((false));
            }else{
                System.out.println("Invalid");
            }


        System.out.println("Your name is: ");
        String name1 = sc.nextLine();
        System.out.println("Your name is: ");
        String name2 = sc.nextLine();
        System.out.println("Your name is: ");
        String name3 = sc.nextLine();
        System.out.println("Your name is: ");

        if (name1.equals(name2)){
            System.out.println(name1 + " and " + name2 + " are namesakes");
        }else if (name2.equals(name3)){
            System.out.println(name3 + " and " + name2 + " are namesakes");
        }else if (name1.equals(name3)){
            System.out.println(name1 + " and " + name3 + " are namesakes");
        }else {
            System.out.println("Invalis");
        }







        }
    }

