import java.net.*;

public class PortTesterServerUDP {
	
	public static void main(String[] args) throws Exception {
		DatagramSocket s = new DatagramSocket(Integer.parseInt(args[0]));
		System.out.println("Awaiting package...");
		s.receive(new DatagramPacket(new byte[6], 6));
		System.out.println("Package received!");
	}
}