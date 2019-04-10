package text2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 		Collection<V> values() 返回此映射中包含的值的 Collection 视图。 
 *		Set<K> keySet() 返回此映射中包含的键的 Set 视图。 	
 */

public class MapTest2 {
	public static void main(String[] args) {
		//创建Map对象
		Map<String,String> map = new HashMap<String,String>();
		//添加映射关系
		map.put("xh001", "张三");
		map.put("xh002", "李四");
		map.put("xh003", "王五");
		method(map);
		//Collection<V> values()
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
			
		}
	}

	private static void method(Map<String, String> map) {
		//Set<K> keySet() 返回此映射中包含的键的 Set 视图。 	
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		//System.out.println(keys);
	}
}
