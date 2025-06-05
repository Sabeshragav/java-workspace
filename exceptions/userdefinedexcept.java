
//userdefined exception

import java.util.*;

class InsufficientAgeException extends Exception {
    public InsufficientAgeException(int age) {
        super("Invalid Age = " + age);
    }
}

class NotValidAgeException extends Exception {
    public NotValidAgeException(int age, String message) {
        super(age + " , " + message);
    }
}

class NotCorrectInputType extends Exception {
    public NotCorrectInputType(String input) {
        super("Input '" + input + "' should be of type integer only");
    }
}

public class userdefinedexcept {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age : ");
            int age = sc.nextInt();

            if (age < 0) {
                throw new NotValidAgeException(age, "Seriously bro ? Age can't be negative");
            } else if (age < 18) {
                throw new InsufficientAgeException(age);
            } else if (age > 100) {
                throw new NotValidAgeException(age, "Seriously bro ? You are already dead!");
            } else {
                System.out.println("You are eligible for voting ");
            }
        } catch (InsufficientAgeException e) {
            System.out.println("Age error : " + e.getMessage());
        } catch (NotValidAgeException e) {
            System.out.println("Age error : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Only integer type of age is accepted");
        } catch (Exception e) {
            System.out.println("No exception matched " + e);
        }

        finally {
            System.out.println("Final Statement");
            sc.close();
        }
    }
}
