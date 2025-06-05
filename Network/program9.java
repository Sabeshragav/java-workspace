import java.util.*;

public class program9 {
    public static void main(String[] args) {
        var table = Map.of("192.168.1.0", "A", "192.168.2.0", "B", "10.0.0.0", "C");
        System.out.println(
                table.getOrDefault(new Scanner(System.in).nextLine(), "No Route"));
    }
}
