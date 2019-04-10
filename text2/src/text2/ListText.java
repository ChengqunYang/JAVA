package text2;

import java.util.ArrayList;
import java.util.List;

/*
 * 定义一个方法，返回列表中指定元素的索引位置
 */
public class ListText {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list.contains("php"));
		int index = index(list,"java");
		System.out.println(index);
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

}
