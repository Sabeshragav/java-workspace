import java.util.*;

public class GraphMethods {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list representation

    // Constructor
    public GraphMethods(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // 1. Add Edge to Graph (Directed)
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // 2. Breadth-First Search (BFS)
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS traversal: ");
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // 3. Depth-First Search (DFS)
    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS traversal: ");
        dfsUtil(start, visited);
        System.out.println();
    }

    // 4. Detect Cycle in a Directed Graph (DFS)
    private boolean detectCycleUtil(int v, boolean[] visited, boolean[] recStack) {
        if (recStack[v])
            return true;
        if (visited[v])
            return false;

        visited[v] = true;
        recStack[v] = true;

        for (int neighbor : adj[v]) {
            if (detectCycleUtil(neighbor, visited, recStack)) {
                return true;
            }
        }
        recStack[v] = false;
        return false;
    }

    public boolean detectCycle() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (detectCycleUtil(i, visited, recStack)) {
                System.out.println("Graph contains a cycle.");
                return true;
            }
        }
        System.out.println("Graph does not contain a cycle.");
        return false;
    }

    // 5. Check Connectivity of Graph (DFS)
    public boolean isConnected() {
        boolean[] visited = new boolean[V];
        dfsUtil(0, visited);

        for (boolean v : visited) {
            if (!v) {
                System.out.println("Graph is not connected.");
                return false;
            }
        }
        System.out.println("Graph is connected.");
        return true;
    }

    // 6. Find Shortest Path from a Start Node (BFS for Unweighted Graph)
    public void shortestPath(int start) {
        int[] distance = new int[V];
        Arrays.fill(distance, -1);
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int neighbor : adj[v]) {
                if (distance[neighbor] == -1) {
                    queue.add(neighbor);
                    distance[neighbor] = distance[v] + 1;
                }
            }
        }

        System.out.println("Shortest path from node " + start + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Distance to node " + i + ": " + distance[i]);
        }
    }

    // 7. Display Graph
    public void displayGraph() {
        System.out.println("Graph adjacency list:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adj[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        GraphMethods graph = new GraphMethods(V);

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display graph
        graph.displayGraph();

        // Perform BFS and DFS traversals
        graph.bfs(0);
        graph.dfs(0);

        // Detect cycle
        graph.detectCycle();

        // Check if graph is connected
        graph.isConnected();

        // Find shortest path from a start node
        graph.shortestPath(0);
    }
}
