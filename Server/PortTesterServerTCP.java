import java.net.*;

public class PortTesterServerTCP {
	
	public static void main(String[] args) throws Exception {
		ServerSocket s = new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("Awaiting connection...");
		Socket ss = s.accept();
		System.out.println("Connection established!");
		s.close();
		ss.close();
		System.out.println("Shuting down");
	}
}