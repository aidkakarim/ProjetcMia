import java.util.Scanner;

public class StringBulderReview {
    public static void main(String[] args) {

        String str2 = new String("Hello guys");
        StringBuilder str = new StringBuilder("Hello guys");

        //append
        System.out.println(str +("2023"));
        System.out.println(str.append("2023"));

        System.out.println(str);

        //reverse()

        System.out.println(str.reverse());

        //

        String text = "Hello"; // -> olleH
        StringBuilder newText = new StringBuilder(text);
        String rText = newText.reverse().toString();

        System.out.println(rText);

        // ask user to enter a text
        // print reverse version of that text

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Pleas enter your text here:");
//
//        String textFromUser = sc.nextLine();
//
//        StringBuilder textFromUser2 = new StringBuilder(textFromUser);
//        textFromUser = textFromUser2.reverse().toString().toUpperCase();
//
//        System.out.println(textFromUser);

        // deleteCharAt() and insert()

        StringBuilder newStr = new StringBuilder("Java is not Fun");
        newStr.deleteCharAt(12);
        newStr.insert(5, "New text");
        System.out.println(newStr);




























    }

}
