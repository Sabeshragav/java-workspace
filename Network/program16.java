import java.util.*;

public class program16 {
    public static void main(String[] args) {
        Map<String, List<String>> graph = Map.of(
                "A", List.of("B", "C"),
                "B", List.of("C", "D"),
                "C", List.of("D"));
        System.out.println(graph.getOrDefault(new Scanner(System.in).nextLine(), List.of("NO MATCH")));
    }
}
