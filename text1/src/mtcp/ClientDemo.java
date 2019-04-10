package mtcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 使用TCP协议发送数据
 * 		创建发送端Socket对象（创建连接）
 * 		获取输出流对象   TCP协议收发数据用的是管道
 * 		发送数据
 * 		释放资源
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象（创建连接）
		//Socket(InetAddress address, int port) 创建一个流套接字并将其连接到指定 IP 地址的指定端口号。
		Socket s = new Socket(InetAddress.getByName("杨成群"), 10086);
		//获取输出流对象
		OutputStream os = s.getOutputStream();
 		//发送数据
		String str = "hello tcp,im comming!";
		os.write(str.getBytes());
 		//释放资源
		s.close(); 
	}
}
