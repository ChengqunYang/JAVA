package text2;

import java.util.HashMap;import java.util.Map;
import java.util.Set;

/*
 * 使用HashMap存储数据并遍历（字符串作为key）
 * 
 */
public class HashMapTest {
	public static void main(String[] args) {
		//创建Map对象
		HashMap<String,String> hm = new HashMap<String,String>();
		//添加映射关系
		hm.put("test001", "张三");
		hm.put("test002", "李四");
		hm.put("test003", "王五");
		//遍历Map对象
		
		//方式一：获取所有的Key，然后通过key来获取每一对值
		Set<String> keys = hm.keySet();
		for(String key:keys) {
			String value = hm.get(key);
			System.out.println(key+"="+value);
			
		}	
		//方式二：获取所有的Map.Entry对象，然后通过Map.Entry获取每一对值
		System.out.println("-----------");
		Set<Map.Entry<String, String>> entrys = hm.entrySet();	
		for(Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
	}
}
