package text2;

import java.util.HashMap;
import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		//1.ʹ��scanner��ȡ�û�������ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.next();
		//2.����Map����,key���ַ����е��ַ�,value���ַ��ĸ���
		HashMap<Character,Integer> map = new HashMap<>();
		//3.�����ַ���,��ȡÿһ���ַ�
		for (char c : str.toCharArray()) {
			//4.ʹ�û�ȡ�����ַ�,ȥmap�����ж�key�Ƿ����
			if (map.containsKey(c)) {
				//key����
				Integer value = map.get(c);
				value++;
				map.put(c, value);
			}else{
				//key������
				map.put(c, 1);
			}
		}
		//5.����map����,������
		for (Character key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key+"="+value);
		}
	}

}