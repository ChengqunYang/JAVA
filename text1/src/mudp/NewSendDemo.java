package mudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ���շ�����ʱ��ע������
 * 		�˿ںŴ������ݿ����ճ����������ᷢ���쳣�����ǽ��ն��ղ���
 * 		�˿ں�����ʹ�ã��������쳣
 * 
 */
public class NewSendDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ�Socket����
		DatagramSocket ds = new DatagramSocket();
		// ����������
		byte[] bys = "hello udp,im comming again!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("���Ⱥ"), 9999);
		// ��������
		ds.send(dp);
		// �ͷ���Դ
		ds.close();
	}
}
