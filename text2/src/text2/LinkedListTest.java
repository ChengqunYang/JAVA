package text2;

import java.util.LinkedList;

/*List �ĳ������ࣺ
 * 
 * 		ArrayList:
 * 				�ײ������飬��ѯ�죬��ɾ��
 * 		LinkedList:
 * 				�ײ���������ѯ������ɾ��
 * LinkedList���е�һЩ���ܣ�
 * 		void addFirst(E e)
 * 		void addLast(E e)
 * 		E getFirst()
 * 		E getLast()
 * 		E removeFirst()
 * 		E removeLast()
 */

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("hello");
		list.add("world");
		
		 //void addFirst(E e)
		list.addFirst("java");
		 //void addLast(E e)
		list.addLast("android");
		 //E getFirst()
		System.out.println(list.getFirst());
		 //E getLast()
		System.out.println(list.getLast());
		 //E removeFirst()
		System.out.println(list.removeFirst());
		 //E removeLast()
		System.out.println(list.removeLast());
		System.out.println(list);
		
	}
}
