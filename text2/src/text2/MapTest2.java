package text2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 		Collection<V> values() ���ش�ӳ���а�����ֵ�� Collection ��ͼ�� 
 *		Set<K> keySet() ���ش�ӳ���а����ļ��� Set ��ͼ�� 	
 */

public class MapTest2 {
	public static void main(String[] args) {
		//����Map����
		Map<String,String> map = new HashMap<String,String>();
		//���ӳ���ϵ
		map.put("xh001", "����");
		map.put("xh002", "����");
		map.put("xh003", "����");
		method(map);
		//Collection<V> values()
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
			
		}
	}

	private static void method(Map<String, String> map) {
		//Set<K> keySet() ���ش�ӳ���а����ļ��� Set ��ͼ�� 	
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		//System.out.println(keys);
	}
}
