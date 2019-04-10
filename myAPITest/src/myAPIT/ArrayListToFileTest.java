package myAPIT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����¼������ѧ����Ϣ��ѧ�ţ����������䣬��ס�أ����뼯�ϡ�Ȼ��������ϰ�ÿһ��ѧ����Ϣ�����ı��ļ���ÿһ��ѧ����ϢΪһ�����ݣ��Լ�����ָ��ǣ�
 * 
 * ������
 * 		A������ѧ����
 * 		B���������϶���
 * 		C��д����ʵ�ּ���¼��ѧ����Ϣ������ѧ��������ΪԪ����ӵ�����
 * 		D�������������������
 * 		E���������ϣ��õ�ÿһ��ѧ����Ϣ������ѧ����Ϣ����һ���ĸ�ʽд���ı��ļ�
 * 			������
 * 				heima001,�����죬30������
 * 		F���ͷ���Դ
 */
public class ArrayListToFileTest {
	public static void main(String[] args) throws IOException {
		//�������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		//д����ʵ�ּ���¼��ѧ����Ϣ������ѧ��������ΪԪ����ӵ�����
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		//�������뻺��������
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		//�������ϣ��õ�ÿһ��ѧ����Ϣ������ѧ����Ϣ����һ���ĸ�ʽд���ı��ļ�
		for(int x=0; x<array.size(); x++){
			Student s = array.get(x);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
		
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
			
		}
		bw.close();
	}
	
	//���ѧ��
	public static void addStudent(ArrayList<Student> array){
		//��������¼�����
		Scanner in = new Scanner(System.in);
		//Ϊ���ô����ܹ��ص������ѭ��
		String id;
		while(true){
			System.out.println("������ѧ��ѧ�ţ�");
			id = in.nextLine();
			//�ж�ѧ����û�б���ռ��
			boolean flag = false;
			for(int x=0;x<array.size();x++){
				Student s = array.get(x);
				if(s.getId().equals(id)){
					flag = true;//˵��ѧ�ű�ռ��
					break;
				}
			}
			if(flag){
				System.out.println("�������ѧ���Ѿ���ռ�ã�����������");
			}else{
				break;//����ѭ��
			}
		}
		System.out.println("������ѧ��������");
		String name = in.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = in.nextLine();
		System.out.println("������ѧ����ס��");
		String address = in.nextLine();
		//����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		//��ѧ��������ΪԪ����ӵ�����
		array.add(s);
		//��ӳɹ�������ʾ
		System.out.println("���ѧ���ɹ���");
		in.close();
	}

}
