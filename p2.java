//Server Side..
import java.net.*;
import java.io.IOException;

class p2
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket ds=new DatagramSocket(8811);
		byte receive_msg[]=new byte[65535];
		byte send[] = null;
		int len;
		
		DatagramPacket dp=new DatagramPacket(receive_msg,receive_msg.length);
		ds.receive(dp);

		String string1 = new String(receive_msg).trim();
		len=string1.length();
		System.out.println("Checking the length of String and sending to P3");
		
		//Checking the length of String..
		if(len<100)
		{
			string1=Integer.toString(len);
			send = string1.getBytes();
			DatagramSocket ds1=new DatagramSocket();
			InetAddress ip1=InetAddress.getLocalHost();
			DatagramPacket dp1=new DatagramPacket(send,send.length,ip1,1234);
			ds.send(dp1);	
						
		}		
	}
}