package mudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * ʹ��UDPЭ�鷢������
 * 		��������socket����
 * 		�������ݲ����
 * 		��������
 * 		�ͷ���Դ
 * DatagramSocket:�����ʾ�������ͺͽ������ݣ�����UDPЭ��
 * DatagramSocket():����Socket�����������˿ں�
 * DatagramScoket(int port):����Socket����ָ���˿ں�
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//��������socket����
		DatagramSocket ds = new DatagramSocket();
		//�������ݲ����
		//DatagramPacket:�����ʾ���ݱ���
		/*
		 * ���ݣ�byte[]
		 * �豸��ַ��ip
		 * ���̵ĵ�ַ���˿ں�
		 * ���췽����DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		 */
		String s = "hello UDP,im comming";
		byte[] bys = s.getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("���Ⱥ");
		int port = 8888;   //�Է��豸�˿ں�
		//���
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
 		//��������
		ds.send(dp);
 		//�ͷ���Դ
		ds.close();
	}
}
