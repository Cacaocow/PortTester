import java.net.*;

public class PortTesterClientTCP {

	public static void main(String[] args) throws Exception {
		System.out.println("Connecting....");
		Socket s = new Socket(args[0], Integer.parseInt(args[1]));
		System.out.println("Connceted!");
	}
}