import java.util.*;

public class check {

    public static void main(String[] args) {
        String s = "anagaram";
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        for (char c : chArr)
            System.out.print(c);

        System.err.println();
        String str = new String(chArr);
        System.out.println(str.getClass().getSimpleName());
    }
}