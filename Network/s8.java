import java.net.*;

public class s8 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String message = "Broadcast Message!";
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(),
                InetAddress.getByName("localhost"), 6789);
        socket.send(packet);
        socket.close();
    }
}
