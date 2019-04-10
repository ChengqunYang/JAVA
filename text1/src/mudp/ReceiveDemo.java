package mudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 使用UDP来接收数据
 * 		创建接收端Socket对象
 * 		接收数据
 * DatagramPacket(byte[] buf, int length) 
          构造 DatagramPacket，用来接收长度为 length 的数据包。
 * 		解析数据
 * 		输出数据
 * 		释放资源
 * 
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(8888);
		
 		//接收数据
		//DatagramPacket(byte[] buf, int length)
		byte[] bys = new byte[1024]; 
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		//解析数据
			/*	 InetAddress getAddress() 
		         返回某台机器的 IP 地址，此数据报将要发往该机器或者是从该机器接收到的。 
		byte[] getData() 
		         返回数据缓冲区。 也可以直接使用创建包对象时的数组
		int getLength() 
		         返回将要发送或接收到的数据的长度。 
		*/
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		int length = dp.getLength();
		//输出数据
		System.out.println("sender"+address.getHostAddress());
		System.out.println(new String(data,0,length));
		System.out.println();
 		//释放资源
		ds.close();
	}
}
