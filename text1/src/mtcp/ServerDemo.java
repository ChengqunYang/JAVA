package mtcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ʹ��TCPЭ���������
  		�������ն�Socket����
  		����(����)
  		��ȡ����������������ݣ��ܵ���
  		��ȡ����
  		�������
  		�ͷ���Դ
  		
  		public class ServerSocket:����ʵ�ַ������׽��֡�
  		ServerSocket(int port) �����󶨵��ض��˿ڵķ������׽��֡�
  		 Socket accept() ���������ܵ����׽��ֵ����ӡ�
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		ServerSocket ss = new ServerSocket(10086);
  		//����(����)
		Socket s = ss.accept();
  		//��ȡ����������������ݣ��ܵ���
		InputStream is = s.getInputStream();
  		//��ȡ����
		byte[] bys = new byte[1024];
		int len;//���ڴ洢�������ֽڸ���
		len = is.read(bys);  //read�������ض�ȡ��Ԫ�ظ���
  		//�������
		System.out.println(new String(bys,0,len));
  		//�ͷ���Դ
		s.close();
//		ss.close();
	}
}
