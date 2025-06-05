import java.net.*;

public class s1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6789);
        byte[] buffer = new byte[1024];
        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + received);

            DatagramPacket response = new DatagramPacket(received.getBytes(), received.length(),
                    packet.getAddress(), packet.getPort());
            socket.send(response);
        }
    }
}
