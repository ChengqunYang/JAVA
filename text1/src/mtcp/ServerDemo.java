package mtcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 使用TCP协议接受数据
  		创建接收端Socket对象
  		监听(阻塞)
  		获取输入流对象接收数据（管道）
  		获取数据
  		输出数据
  		释放资源
  		
  		public class ServerSocket:此类实现服务器套接字。
  		ServerSocket(int port) 创建绑定到特定端口的服务器套接字。
  		 Socket accept() 侦听并接受到此套接字的连接。
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		ServerSocket ss = new ServerSocket(10086);
  		//监听(阻塞)
		Socket s = ss.accept();
  		//获取输入流对象接收数据（管道）
		InputStream is = s.getInputStream();
  		//获取数据
		byte[] bys = new byte[1024];
		int len;//用于存储读到的字节个数
		len = is.read(bys);  //read函数返回读取的元素个数
  		//输出数据
		System.out.println(new String(bys,0,len));
  		//释放资源
		s.close();
//		ss.close();
	}
}
