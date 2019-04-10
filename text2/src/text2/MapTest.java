package text2;

import java.util.HashMap;
import java.util.Map;

/*
 * 需求：实现学号姓名这样有对应关系的数据存储
 * 
 * 		为了实现这种有对应关系的数据，我们之前所学习的内容是可以实现的，但是不是很方便
 * 		java为我们提供了一个新的数据类型，专门用于存储对应关系的集合
 * 		Map:将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
 * 			接口 Map<K,V>
		 	类型参数：
				K - 此映射所维护的键的类型
				V - 映射值的类型
		Map和Collection有什么区别？
		Map:是一个双列集合，常用于处理有对应关系的数据，key是不可以重复的，我们也称为夫妻对集合
		Collection:是单列集合，Collection有不同的子体系，有的允许重复有索引有序，有的不允许重复，并且无索引无序，我们也称其为单身汉集合
 * 
 * 一对一：
 * 		一个学号对应一个姓名
 */
/*
 * Map的常用功能：
 * 		删除功能：	
 * 					void clear()  从此映射中移除所有映射关系（可选操作）。
 * 					V remove(Object key) 如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 * 		判断功能：
 * 					boolean isEmpty() 如果此映射未包含键-值映射关系，则返回 true。 
 * 					boolean containsKey(Object key) 如果此映射包含指定键的映射关系，则返回 true。
 * 					boolean containsValue(Object value) 如果此映射将一个或多个键映射到指定值，则返回 true。
 * 		遍历功能：
 * 					Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。 
 *		获取功能：	
 *					V get(Object key)  返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。 
 *					int size() 返回此映射中的键-值映射关系数。 
 *		映射功能：
 *					 V put(K key, V value) 将指定的值与此映射中的指定键关联（可选操作）。 
 *
 */

public class MapTest {
	public static void main(String[] args) {
	//创建Map对象
		Map<String,String> map = new HashMap<String,String>();
		
		//V put(K key,V value)    //就是将key映射到value的功能，如果key存在，则覆盖value，并将原来的value返回
		System.out.println(map.put("xh001", "张三"));
		System.out.println(map.put("xh002", "李四"));
		System.out.println(map.put("xh003", "王五"));
		
		//boolean containsKey(Object key) //判断指定的key是否存在
		System.out.println(map.containsKey("xh001"));
		//boolean containsValue(Object value):判断指定的value是否存在
		System.out.println(map.containsValue("王五"));
		
		//void clear()  //清空所有的对应关系
		//map.clear();
		
		//V remove(Object key)//根据指定的key删除对应关系，并返回key所对应的值，如果没有删除成功则返回null
		System.out.println(map.remove("xh002"));
		//boolean isEmpty() //判断是否有对应关系
		System.out.println(map.isEmpty());
		//int size()  //返回对应关系的个数
		System.out.println(map.size());
		// V get(object key)  //返回指定key的对应value
		System.out.println(map.get("xh001"));
		System.out.println(map);
		
	}
}
