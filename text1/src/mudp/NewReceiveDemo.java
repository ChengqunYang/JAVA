package mudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class NewReceiveDemo {
	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		DatagramSocket ds = new DatagramSocket(9999);
		
		//����������
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//��������
		ds.receive(dp);
		
		//��������
		//��ȡ���Ͷ�ip����
		InetAddress address = dp.getAddress();
		//��ȡ����
		byte[] data = dp.getData();
		//��ȡ���ݳ���
		int length = dp.getLength();
		
		//�������
		System.out.println("sender --->"+address.getHostName()+address.getHostAddress());
		System.out.println(new String(data,0,length));
		
		//�ͷ���Դ
		ds.close();
	}
}
