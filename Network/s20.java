import java.io.*;
import java.net.*;

public class s20 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6789);
        while (true) {
            Socket client = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println(new StringBuilder(in.readLine()).reverse());
            client.close();
        }
    }
}
