//Another Server..
import java.net.*;
import java.io.IOException;

class p3
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket ds=new DatagramSocket(1234);
		byte receive_msg[]=new byte[65535];
		DatagramPacket dp=new DatagramPacket(receive_msg,receive_msg.length);
		ds.receive(dp);

		String string1 = new String(receive_msg).trim();
		System.out.println(string1);	
	}
}