import java.util.Scanner;
public class RegularExp {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(input+" "+input.matches(".*\\bHarry\\b.*"));
    }
}
