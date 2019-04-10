package mudp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress:此类表示互联网协议（IP）地址
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//static InetAddress getByName(String host)
		InetAddress address = InetAddress.getByName("杨成群");
		System.out.println(address);
		InetAddress address2 = InetAddress.getByName("10.150.26.216");
		System.out.println(address2);
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		System.out.println(InetAddress.getLocalHost());
		System.out.println(address.getCanonicalHostName());
	}
}
