package mudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ʹ��UDP����������
 * 		�������ն�Socket����
 * 		��������
 * DatagramPacket(byte[] buf, int length) 
          ���� DatagramPacket���������ճ���Ϊ length �����ݰ���
 * 		��������
 * 		�������
 * 		�ͷ���Դ
 * 
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		DatagramSocket ds = new DatagramSocket(8888);
		
 		//��������
		//DatagramPacket(byte[] buf, int length)
		byte[] bys = new byte[1024]; 
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		//��������
			/*	 InetAddress getAddress() 
		         ����ĳ̨������ IP ��ַ�������ݱ���Ҫ�����û��������ǴӸû������յ��ġ� 
		byte[] getData() 
		         �������ݻ������� Ҳ����ֱ��ʹ�ô���������ʱ������
		int getLength() 
		         ���ؽ�Ҫ���ͻ���յ������ݵĳ��ȡ� 
		*/
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		int length = dp.getLength();
		//�������
		System.out.println("sender"+address.getHostAddress());
		System.out.println(new String(data,0,length));
		System.out.println();
 		//�ͷ���Դ
		ds.close();
	}
}
