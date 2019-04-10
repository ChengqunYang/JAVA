package objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * ���������������ȡ��������쳣������
 */
public class ObjectOutputStreamDemo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		method();    //�Ѷ����б�洢���ļ���
		//������������������
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		//��ȡ����
		Object obj = ois.readObject();
		//System.out.println(obj);
		
		//����ת�ͣ���ȡ������������
		ArrayList<Student> list = (ArrayList<Student>) obj; 
		for (Student student : list) {
			System.out.println(student);
		}
		//�ͷ���Դ
		ois.close();
	}

	private static void method() throws IOException, FileNotFoundException {
		//�����������������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		//�������϶���
		ArrayList<Student> list = new ArrayList<Student>();
		
		//���ѧ������
		list.add(new Student("����",10));
		list.add(new Student("����",15));
		list.add(new Student("����",20));
		//д�����϶���
		oos.writeObject(list);
		//�ͷ���Դ
		oos.close();
	}
}
