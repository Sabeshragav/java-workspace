import java.net.*;

public class c8 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6789);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        System.out.println("Received: " + new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
