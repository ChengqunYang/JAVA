package text2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 定义一个方法，返回列表中指定元素的索引位置
 */
public class ListText {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("张三", "20");
		map.put("李四", "21");
		map.put("王五", "22");
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list.contains("php"));
		int index = index(list,"java");
		System.out.println(index);
		bianli(map);
	}
	public static int index(List list,Object other) {
		for(int x = 0; x < list.size(); x++) {
			//获取列表中的元素
			Object obj = list.get(x);
			//进行比较
			if(obj.equals(other)) {
				return x;
			}
		}
		return -1;   //表示查找不到指定的元素
	}
	public static void bianli(Map<String,String> map) {
		/*Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+"="+value);
		}*/
		for (String  key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key+"="+value);
		}
	}

}
