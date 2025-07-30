
class bitRepresentation {
    public static void main(String[] args) {
        int a = 10;
        String str = "";
        int count = 0;

        while (a > 0) {
            str = (a % 2) + str;
            a /= 2;
            count++;
        }
        while (count < 32) {
            str = 0 + str;
            count++;
        }

        System.out.println(str);
    }
}
