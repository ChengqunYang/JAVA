package text2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 使用HashMap 存储数据并遍历（自定义对象作为Key）
 */
public class HashMapTest2 {
	public static void main(String[] args) {
		//创建Map对象
		HashMap<Student,String> hm = new HashMap<Student,String>();
		//创建Key对象
		Student s  = new Student("张三","20");
		Student s2 = new Student("李四","18");
		Student s3 = new Student("李四","18");
		//添加映射关系
		hm.put(s, "001");
		hm.put(s2, "002");
		hm.put(s3, "003");
		//遍历Map对象
		//第一种：
		Set<Student> keys = hm.keySet();
		for(Student key : keys) {
			String value = hm.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("---------");
		//第二种
		Set<Map.Entry<Student, String>> entrys = hm.entrySet();
		for (Map.Entry<Student, String> entry : entrys) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
	}
}
