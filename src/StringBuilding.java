public class StringBuilding {

    public static void main(String[] args) {


       String str = "Text";

       String str2 = new String("Text");

       // SB

        StringBuilder str3= new StringBuilder("Text");

        System.out.println(str3);

        str3.append ("Hello");
        System.out.println(str3 + "!");

        // SB

        StringBuilder sb = new StringBuilder("Tech Nova");
        System.out.println(sb);

        // append()
        System.out.println(sb.append ("Hello"));
        System.out.println(sb+ "'s Class");

        // reverse()

        System.out.println(sb.reverse());
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.delete(7,12));

        // new SB

        StringBuilder sb2 = new StringBuilder("Hello Welcome");

        System.out.println(sb2.insert(5, " and"));















    }
}
