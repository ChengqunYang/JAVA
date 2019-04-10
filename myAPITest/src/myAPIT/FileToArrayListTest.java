package myAPIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��array.txt�е����ݶ�ȡ�����洢�������У�Ȼ��������ϣ��ڿ���̨���
 * 
 * 
 * ������
 * 		A������ѧ����
 * 		B���������뻺��������
 * 		C���������϶���
 * 		D����ȡ�ļ����ݣ�������һ���ĸ�ʽ���зָֵ��ѧ������Ȼ���ѧ��������ΪԪ�ش洢��������ȥ
 * 			001�������죬30������
 * 		E���ͷ���Դ
 * 		F���������ϣ���ӡ
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		
		//�������϶���
		ArrayList<Student> array =  new ArrayList<Student>();
		//��ȡ�ļ����ݣ�������һ���ĸ�ʽ���зָֵ��ѧ������Ȼ���ѧ��������ΪԪ�ش洢��������ȥ
			
		String line;
		while((line=br.readLine())!=null){
			String[] strArray = line.split(",");
			Student s = new Student();
			s.setId(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(strArray[2]);
			s.setAddress(strArray[3]);
			//��ѧ��������ΪԪ�ش洢��������
			
			array.add(s);
		}
		br.close();
		
		//��������
		System.out.println("ѧ��\t\t����\t����\t��ס��");
		for(int x=0; x<array.size(); x++){
		Student s = array.get(x);
		System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress()+"\t");
		}
		
	}
}
