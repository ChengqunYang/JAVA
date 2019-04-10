package text2;

import java.util.ArrayList;

/*
 * ArrayList<E>:
 * 大小可变的数组的实现
 * <E>：是一种特殊的数据类型，泛型
 * 在出现E的地方使用引用数据类型替换即可。
 * 构造方法：
 * 		ArrayList()
 * 添加元素：
 * 		public boolean add(E e);：添加元素
 * 		public void add(int index,E element);:在指定索引处添加元素
 * 获取元素：
 * 		public E get(int index);:返回指定索引处的元素
 * 集合长度：
 * 		public int size(); :返回集合中元素的个数
 * 删除元素：
 * 		public boolean remove(Object o):删除指定的元素，返回删除是否成功
 * 		public E remove(int index):删除指定索引处的元素，返回被删除的元素
 * 修改元素：
 * 		public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
 */
public class ArrayListTest {
/*	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		array.add(1, "ycq");
		System.out.println("array"+array);
	}
}
 */
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
	//	System.out.println("array"+array);
	//	public E get(int index):返回指定索引处的元素
	//	System.out.println("get:"+array.get(0));
	//	System.out.println("get:"+array.get(1));
	//	System.out.println("get:"+array.get(2));
		
	//	public int size():返回集合中元素的个数
		//System.out.println("size"+array.size());
	//	public boolean remove(object o):删除指定元素，返回删除是否成功
	//	System.out.println("remove:"+array.remove("world"));
	//	System.out.println("remove:"+array.remove("world"));
	//	System.out.println("array"+array);
	//	public E remove(int index):删除指定索引处的元素，返回被删除的元素
	//	System.out.println("remove:"+array.remove(0));
	//	public E set(int index,E element):修改指定位置处的元素，返回被修改的元素
		System.out.println("set:"+array.set(1,"android" ));
		System.out.println("array"+array);
	}
}