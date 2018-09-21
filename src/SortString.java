import java.util.*;
public class SortString {
    public static void main(String[] args) {
        String str = "A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea.";

        String[] input = str.split(" ");
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
    }
    }

