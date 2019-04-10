package text2;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties:表示了一个持久的属性集，属性列表中每一个键及其对应值都是一个字符串
 * 
 * 构造方法：
 * 		Properties()
 * 
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//创建属性列表对象
		Properties prop = new Properties();
		//添加映射关系
		prop.put("CZBK001", "zhangsan");
		prop.put("ZCBK002", "lisi");
		prop.put("ZCBK003", "wangwu");
		//遍历属性列表
		//获取所有的key,通过key获取所有的value
		Set<Object> keys = prop.keySet();
		for(Object key : keys) {
			Object value = prop.get(key);
			System.out.println(key + "=" + value);
		}
		//获取所有的结婚证对象
		System.out.println("--------");
		Set<Map.Entry<Object, Object>> entrys = prop.entrySet();
		for(Map.Entry<Object, Object> entry : entrys) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"="+value);
		}
		
	}
}
