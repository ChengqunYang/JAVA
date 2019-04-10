package text1;

import java.util.ArrayList;
import java.util.Collection;
/*
 * foreach:增强for循环，一般用于遍历集合或者数组
 * 在增强for循环中不能修改集合，否则会出现并发修改异常，因为其本质就是迭代器
 * 格式：
 * 		for(元素类型变量：集合或者数组对象) {
 * 			可以直接使用变量;
 */

public class ForEachDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection<String> c = new ArrayList<String>();
		
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		//增强for循环遍历集合
		for(String s : c){
			System.out.println(s.length());
			System.out.println(s.toUpperCase());
		}
	}
}
