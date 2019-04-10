package text2;

import java.util.HashMap;import java.util.Map;
import java.util.Set;

/*
 * ʹ��HashMap�洢���ݲ��������ַ�����Ϊkey��
 * 
 */
public class HashMapTest {
	public static void main(String[] args) {
		//����Map����
		HashMap<String,String> hm = new HashMap<String,String>();
		//���ӳ���ϵ
		hm.put("test001", "����");
		hm.put("test002", "����");
		hm.put("test003", "����");
		//����Map����
		
		//��ʽһ����ȡ���е�Key��Ȼ��ͨ��key����ȡÿһ��ֵ
		Set<String> keys = hm.keySet();
		for(String key:keys) {
			String value = hm.get(key);
			System.out.println(key+"="+value);
			
		}	
		//��ʽ������ȡ���е�Map.Entry����Ȼ��ͨ��Map.Entry��ȡÿһ��ֵ
		System.out.println("-----------");
		Set<Map.Entry<String, String>> entrys = hm.entrySet();	
		for(Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
	}
}
