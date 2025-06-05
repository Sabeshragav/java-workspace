import java.net.*;
import java.io.*;

public class c4 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        byte[] sendBuffer = "Hello Server".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, address, 6789);
        socket.send(sendPacket);

        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        socket.receive(receivePacket);
        System.out.println("Server: " + new String(receivePacket.getData(), 0, receivePacket.getLength()));
        socket.close();
    }
}
