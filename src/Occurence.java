import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next().toLowerCase();
        System.out.println("Enter a character to count in the string " + s);
        char c = sc.next(".").toLowerCase().charAt(0); // This logic is to read
        // only one character
        int cn = s.length() - s.replaceAll(String.valueOf(c), "").length();
        System.out.println(c + " occurs " + cn + " times in " + s);
        sc.close();
    }
}
