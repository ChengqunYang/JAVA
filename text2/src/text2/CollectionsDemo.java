package text2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collection是集合的最顶层，包含了集合的共性
 * Collections是一个工具类，里面的方法都是用来操作Collection
 * 
 */

public class CollectionsDemo {
	public static void main(String[] args) {
		//method();
		//method2();
		//method3();
		//method4();
		//method5();
		//method6();
		//method7();
		
	
}

	private static void method7() {
		//static void swap(List list,int i,int j):将指定列表中的两个索引进行位置的互换
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		Collections.swap(list, 1, 2);
		System.out.println(list);
	}

	private static void method6() {
		//static void sort(List list)  :按照列表中元素的自然顺序进行排序
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		
		Collections.sort(list);
		System.out.println(list);
	}

	private static void method5() {
		//static void shuffle(List list):随机置换
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void method4() {
		//static void reverse(List list)  :反转
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Collections.reverse(list);
		System.out.println(list);
	}

	private static void method3() {
		//static void fill(List list,Object obj):使用指定的对象填充列表的所有元素
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		System.out.println(list);
		
		Collections.fill(list,"android");
		System.out.println(list);
	}

	private static void method2() {
		//static void copy(List dest,List src):把源列表中的数据覆盖到目标列表
		//注意：目标列表的长度至少等于源列表的长度
		//创建源列表
		List<String> src = new ArrayList<String> ();
		src.add("hello");
		src.add("world");
		src.add("java");
		
		//创建目标列表
		List<String> dest = new ArrayList<String>();
		dest.add("java");
		dest.add("java");
		dest.add("java");
		dest.add("java");
		Collections.copy(dest, src);
		System.out.println(dest);
	}

	private static void method() {
		//static int binarySearch(List list, Object key)  使用二分法查找指定元素在列表的索引位置
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	
	int index = Collections.binarySearch(list, 4);
	System.out.println(index);
	}
}
