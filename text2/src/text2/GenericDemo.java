package text2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ʹ�ü��ϴ洢����������
 */
public class GenericDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection<Student2> c = new ArrayList<Student2>();
		//����Ԫ�ض���
		Student2 s = new Student2("zhangsan",18);
		Student2 s2 = new Student2("lisi",20);
		//���Ԫ�ض���
		c.add(s);
		c.add(s2);
		//�������϶���
		Iterator<Student2> it = c.iterator();
		while(it.hasNext()){
			//String str = (String)it.next();
			//System.out.println(str);
			Student2 stu = it.next();
			System.out.println(stu.name);
		}
	}
}
class Student2 {
	String name;
	int age;
	
	public Student2(String name,int age) {
		this.name = name;
		this.age = age;
	}
}