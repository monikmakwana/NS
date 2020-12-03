//Client Side..
import java.net.*;
import java.io.IOException;
import java.util.*;

class p1
{
	public static void main(String[] args) throws IOException
	{	
		DatagramSocket ds=new DatagramSocket();
		InetAddress ip=InetAddress.getLocalHost();
		
		Scanner sc=new Scanner(System.in);
		//String msg="Hello";
		String msg;
		System.out.println("Enter String :");
		msg=sc.nextLine();
		
		
		byte buf[]=null;
		buf=msg.getBytes();
		DatagramPacket dp=new DatagramPacket(buf,buf.length,ip,8811);
		ds.send(dp);
					
	}
}