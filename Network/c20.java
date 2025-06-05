import java.io.*;
import java.net.*;

public class c20 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6789);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        out.println(user.readLine());
        System.out.println("Reversed: " + in.readLine());
        socket.close();
    }
}
