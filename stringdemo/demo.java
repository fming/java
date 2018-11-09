import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String knights =
        "Then, when you have found the shrubbery, you must " +
        "cut down the mightiest tree in the forest... " +
        "with... a herring!";
        
        System.out.println(Arrays.toString(knights.split("[\\s]+")));
    }
}