package text2;

import java.util.ArrayList;

/*
 * ArrayList<E>:
 * ��С�ɱ�������ʵ��
 * <E>����һ��������������ͣ�����
 * �ڳ���E�ĵط�ʹ���������������滻���ɡ�
 * ���췽����
 * 		ArrayList()
 * ���Ԫ�أ�
 * 		public boolean add(E e);�����Ԫ��
 * 		public void add(int index,E element);:��ָ�����������Ԫ��
 * ��ȡԪ�أ�
 * 		public E get(int index);:����ָ����������Ԫ��
 * ���ϳ��ȣ�
 * 		public int size(); :���ؼ�����Ԫ�صĸ���
 * ɾ��Ԫ�أ�
 * 		public boolean remove(Object o):ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
 * 		public E remove(int index):ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
 * �޸�Ԫ�أ�
 * 		public E set(int index,E element)���޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
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
	//	public E get(int index):����ָ����������Ԫ��
	//	System.out.println("get:"+array.get(0));
	//	System.out.println("get:"+array.get(1));
	//	System.out.println("get:"+array.get(2));
		
	//	public int size():���ؼ�����Ԫ�صĸ���
		//System.out.println("size"+array.size());
	//	public boolean remove(object o):ɾ��ָ��Ԫ�أ�����ɾ���Ƿ�ɹ�
	//	System.out.println("remove:"+array.remove("world"));
	//	System.out.println("remove:"+array.remove("world"));
	//	System.out.println("array"+array);
	//	public E remove(int index):ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
	//	System.out.println("remove:"+array.remove(0));
	//	public E set(int index,E element):�޸�ָ��λ�ô���Ԫ�أ����ر��޸ĵ�Ԫ��
		System.out.println("set:"+array.set(1,"android" ));
		System.out.println("array"+array);
	}
}