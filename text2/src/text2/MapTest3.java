package text2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map�ĵ�һ�ֱ�����ʽ��
 * 			�����ټ����е��ɷ�
 * 			�������е��ɷ�
 * 			��ȡÿһ���ɷ�
 * 			��ÿһ���ɷ�ȥ�����ǵ�ϱ��
 * 
 * 
 * 	Map�ĵڶ��ֱ�����ʽ�����������
 * 			Set<Map.Entry<K,V>> entrySet() ���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ�� 
 */
public class MapTest3 {
	public static void main(String[] args) {
		//method();
		Map<String,String> map = new HashMap<String,String>();
		 map.put("abc", "123");
		 map.put("bcd", "234");
		 map.put("cde", "345");
		 
		 Set<Map.Entry<String, String>> entrys = map.entrySet();
		 for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:"+key+"value:"+value);
		}
	}

	private static void method() {
		//����Map����
		Map<String,String> map = new HashMap<String,String>();
		
		//���ӳ���ϵ
		map.put("123", "abc");
		map.put("234", "bcd");
		map.put("345", "cde");
		//����Map����
		Set<String> keys = map.keySet();
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(key +","+value);
		}
	}

}
