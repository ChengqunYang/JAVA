package text2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ʹ��HashMap �洢���ݲ��������Զ��������ΪKey��
 */
public class HashMapTest2 {
	public static void main(String[] args) {
		//����Map����
		HashMap<Student,String> hm = new HashMap<Student,String>();
		//����Key����
		Student s  = new Student("����","20");
		Student s2 = new Student("����","18");
		Student s3 = new Student("����","18");
		//���ӳ���ϵ
		hm.put(s, "001");
		hm.put(s2, "002");
		hm.put(s3, "003");
		//����Map����
		//��һ�֣�
		Set<Student> keys = hm.keySet();
		for(Student key : keys) {
			String value = hm.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("---------");
		//�ڶ���
		Set<Map.Entry<Student, String>> entrys = hm.entrySet();
		for (Map.Entry<Student, String> entry : entrys) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
	}
}
