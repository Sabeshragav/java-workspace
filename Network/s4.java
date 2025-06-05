import java.net.*;

public class s4 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6789);
        byte[] buffer = new byte[1024];
        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Client: " + received);

            String response = "Hello Client";
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(), response.length(),
                    packet.getAddress(), packet.getPort());
            socket.send(responsePacket);
        }
    }
}
