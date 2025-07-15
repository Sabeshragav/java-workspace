
public class check {

    public static void main(String[] args) {
        String word = "UuE6";
        for (char ch : word.toLowerCase().toCharArray()) {
            System.out.println(checkPresence(ch, "sp"));
        }
    }

    static boolean checkPresence(char ch, String checkFor) {
        if (checkFor.contains("vowel")) {
            return ch >= 'a' && ch <= 'z' &&
                    ch == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u';
        }
        if (checkFor.contains("cons")) {
            return ch >= 'a' && ch <= 'z' &&
                    ch != 'a' &&
                    ch != 'e' &&
                    ch != 'i' &&
                    ch != 'o' &&
                    ch != 'u';
        }
        if (checkFor.contains("sp")) {
            return ch == '@' ||
                    ch == '#' ||
                    ch == '$';
        }

        if (checkFor.contains("digit")) {
            return ch == '0' ||
                    ch == '1' ||
                    ch == '2' ||
                    ch == '3' ||
                    ch == '4' ||
                    ch == '5' ||
                    ch == '6' ||
                    ch == '7' ||
                    ch == '8' ||
                    ch == '9';
        }

        return false;
    }
}