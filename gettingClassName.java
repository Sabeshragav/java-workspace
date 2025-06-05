
public class gettingClassName {

    public static void main(String[] args) {
        double str = 3;
        Double num = str;
        System.out.println("Data type of str: " + num.getClass().getSimpleName());

        if (num.getClass().getSimpleName().equals("Double")) {
            System.out.println("yes its double");
        } else {
            System.out.println("No its not double");
        }
    }
}