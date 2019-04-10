package edu.xust.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * ����ͨ�ŵĵ�һ��Ҫ�أ�IP��ַ��ͨ��IP��ַ��Ψһ�Ķ�λ��������һ̨����
 * InetAddress:λ��java.net����
 * 1.InetAddress��������IP��ַ��һ��InetAdress�Ķ���ʹ�����һ��IP��ַ
 * 2.��δ���InetAddress�Ķ���getByName(String host)
 * 3.getHostName(): ��ȡIP��ַ��Ӧ������
 *   getHostAddress():��ȡIP��ַ
 */
public class TestInetAddress {
	public static void main(String[] args) throws Exception {
		//����һ��InetAddress����getByName()
		InetAddress inet = InetAddress.getByName("www.xust.edu.cn");
		
		//InetAddress inet = InetAddress.getByName("61.240.149.132");
		System.out.println(inet);

		//��������
		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());
		//��ȡ������IP:getLocalHost()
		InetAddress inet1 = InetAddress.getLocalHost();
		System.out.println(inet1);
		System.out.println(inet1.getHostName());//Miranda-THINK/192.168.1.101
		System.out.println(inet1.getHostAddress());
	}
}
