package mudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议收发数据时的注意事项
 * 		端口号错误，数据可以照常发出，不会发生异常，但是接收端收不到
 * 		端口号正在使用，则会出现异常
 * 
 */
public class NewSendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端Socket对象
		DatagramSocket ds = new DatagramSocket();
		// 创建包对象
		byte[] bys = "hello udp,im comming again!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("杨成群"), 9999);
		// 发送数据
		ds.send(dp);
		// 释放资源
		ds.close();
	}
}
