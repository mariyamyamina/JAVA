package String;
import java.util.*;

public class Strings {
    public static void main(String[]args){
        String str = new String("abcd");
        System.out.println(str);

        String str2 = "yamina";
        System.out.println(str2);

        //input / output

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        //String length()

        String fullName = sc.nextLine();
        System.out.println(fullName.length());

        //concatenation
        String firstName = "Mariyam";
        String lastName = "Yamina";
        String FullName = firstName + " " + lastName;
        System.out.println(FullName);
        System.out.println(FullName.charAt(0));

        sc.close();
    }
}
