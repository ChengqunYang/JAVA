package mtcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * ʹ��TCPЭ�鷢������
 * 		�������Ͷ�Socket���󣨴������ӣ�
 * 		��ȡ���������   TCPЭ���շ������õ��ǹܵ�
 * 		��������
 * 		�ͷ���Դ
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socket���󣨴������ӣ�
		//Socket(InetAddress address, int port) ����һ�����׽��ֲ��������ӵ�ָ�� IP ��ַ��ָ���˿ںš�
		Socket s = new Socket(InetAddress.getByName("���Ⱥ"), 10086);
		//��ȡ���������
		OutputStream os = s.getOutputStream();
 		//��������
		String str = "hello tcp,im comming!";
		os.write(str.getBytes());
 		//�ͷ���Դ
		s.close(); 
	}
}
