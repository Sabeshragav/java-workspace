import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frames: ");
        String[] frames = sc.nextLine().split(" ");
        int windowSize = 5, sent = 0;
        while (sent < frames.length) {
            for (int i = 0; i < windowSize && sent + i < frames.length; i++) {
                System.out.println("Sent: " + frames[sent + i]);
                try {
                    Thread.sleep(4000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("Acknowledged: " + frames[sent]);
            sent++;
        }
    }
}
