package text2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map的第一种遍历方式：
 * 			首先召集所有的丈夫
 * 			遍历所有的丈夫
 * 			获取每一个丈夫
 * 			让每一个丈夫去找他们的媳妇
 * 
 * 
 * 	Map的第二种遍历方式：更面向对象
 * 			Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。 
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
		//创建Map对象
		Map<String,String> map = new HashMap<String,String>();
		
		//添加映射关系
		map.put("123", "abc");
		map.put("234", "bcd");
		map.put("345", "cde");
		//遍历Map对象
		Set<String> keys = map.keySet();
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(key +","+value);
		}
	}

}
