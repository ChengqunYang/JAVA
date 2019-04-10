package myStudentManagerT;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * �����ҵ�ѧ������ϵͳ������
 * 
 * 
 * 
 * A������ѧ����
 * B��ѧ������ϵͳ��������Ĵ����д
 * C: ѧ������ϵͳ�Ĳ鿴��������ѧ���Ĵ����д
 * D��ѧ������ϵͳ���ѧ���Ĵ����д
 * E��ѧ������ϵͳ��ɾ��ѧ���Ĵ����д
 * F��ѧ������ϵͳ���޸�ѧ���Ĵ����д
 */
public class StudentManagerTest {
	public static void main(String[] args) {
		//�������϶������ڴ洢ѧ������
		ArrayList<Student> array = new ArrayList<Student>();
		while(true){ //Ϊ���ǳ���ص�������������ʹ��ѭ��
			System.out.println("--------��ӭ����ѧ������ϵͳ--------");
			System.out.println("1�鿴����ѧ��");
			System.out.println("2���ѧ��");
			System.out.println("3ɾ��ѧ��");
			System.out.println("4�޸�ѧ��");
			System.out.println("5�˳�");
			System.out.println("���������ѡ��:");
			Scanner in = new Scanner(System.in);
			String choiceString = in.nextLine();
			switch(choiceString){
			case "1":
				//�鿴����ѧ��
				findAllStudent(array);
				break;
			case "2":
				//���ѧ��
				addStudent(array);
				break;
			case "3":
				//ɾ��ѧ��
				deleteStudent(array);
				break;
			case "4":
				//�޸�ѧ��
				updateStudent(array);
				break;
			case "5":
				//�˳�
			default:
				System.out.println("лл���ʹ�ã�");
				System.exit(0);//JVM�˳�
				break;
			}
		}
	}
	//�鿴����ѧ��
	public static void findAllStudent(ArrayList<Student> array){
		//�����жϼ������Ƿ������ݣ����û���ݸ���ʾ�����������ļ���ִ��
		if(array.size() == 0){
			System.out.println("������˼����ǰû��ѧ����Ϣ�ɲ�ѯ�����ȥ����ѡ����Ĳ���");
			return;
		}
		//������Ϣ���ͷ
		System.out.println("ѧ��\t\t����\t����\t��ס��");
		for(int x=0; x<array.size(); x++){
			Student s = array.get(x);
			System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	//���ѧ��
	public static void addStudent(ArrayList<Student>array){
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
	}
	//ɾ��ѧ��
	public static void deleteStudent(ArrayList<Student> array){
		//����¼��һ��ѧ�ţ���������ȥ�����Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ������ɾ��
		Scanner in = new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����ѧ��");
		String id = in.nextLine();
		//��������
		int index = -1;
		for(int x=0;x<array.size();x++){
			//��ȡÿһ��ѧ������
			Student s = array.get(x);
			if(s.getId().equals(id)){
				index = x;
				break;
			}
		}
		//������ʾ
		if(index == -1){
			System.out.println("������˼������Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ����ȥ����ѡ��");
		}else{
			array.remove(index);
			System.out.println("ɾ��ѧ���ɹ���");
		}
	}
	//�޸�ѧ��
	public static void updateStudent(ArrayList<Student> array){
		//����¼��һ��ѧ�ţ���������ȥ���ң������ѧ���Ǹ�ѧ�����޸�����Ϣ
		Scanner in = new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
		String id = in.nextLine();
		int index = -1;
		for(int x = 0;x<array.size();x++){
			//��ȡÿһ��ѧ������
			Student s = array.get(x);
			if(s.getId().equals(id)){
				index = x;
				break;
			}
		}
		if(index ==-1){
			System.out.println("������˼����Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ����ȥ����ѡ��");		
		}else{
			System.out.println("������ѧ��������");
			String name = in.nextLine();
			System.out.println("������ѧ��������");
			String age = in.nextLine();
			System.out.println("������ѧ���µ�ַ");
			String address = in.nextLine();
			//����ѧ������
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			array.set(index, s);
			//������ʾ
			System.out.println("�޸�ѧ���ɹ���");
		}
	}
}
