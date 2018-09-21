import java.util.regex.*;
public class MultipleOcc {
    public void findOcc(String input,String search){
        Pattern pattern = Pattern.compile(search);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Found at: " + matcher.start()+"-"+matcher.end());
        }
    }

    public static void main(String[] args) {
        MultipleOcc  findAllOccurences = new MultipleOcc();
        findAllOccurences.findOcc("She sells seashells by the seashore","se");
    }
}
