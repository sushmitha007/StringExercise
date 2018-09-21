import java.util.Scanner;
import java.lang.*;
public class Replace
{
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String input1 = input.replace("d","f");
        String input2 = input1.replace("l", "t");
        System.out.println(input2);
    }
}
