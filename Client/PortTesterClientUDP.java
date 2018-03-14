import java.net.*;

public class PortTesterClientUDP {

	public static void main(String[] args) throws Exception {
		DatagramSocket dgs = new DatagramSocket();
		DatagramPacket dgp = new DatagramPacket(new byte[]{1,2,3,4,5,6}, 6, InetAddress.getByName(args[0]), Integer.parseInt(args[1]));
		dgs.send(dgp);
		System.out.println("Package sent");
	}
}