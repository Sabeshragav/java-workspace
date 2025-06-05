
//exception
public class exception {
    public static void main(String[] args) {
        int a, b;
        try {
            a = 4;
            b = 0;
            System.out.println(a / b);
            System.out.println("End of try");
        } catch (ArithmeticException e) {
            System.out.println("Number check panunga broo");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End of finally");
        }
    }
}
