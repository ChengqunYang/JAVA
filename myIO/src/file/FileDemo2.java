package file;

import java.io.File;
import java.io.IOException;

/*
 * ��������
 * 				boolean createNewFlie()
 * 				boolean mkdir()
 * 				boolean mkdirs()
 * 	ɾ������
 * 				boolean delete()
 * 
 * ����·�����̶����ɸı��·�������̷���ͷ
 * ���·�������ĳ��������������̷���ͷ
 * 				��eclipse�����·�����Ӧ��ǰ��Ŀ�ĸ�Ŀ¼
 * 
 * 
 * ע�⣺ɾ��һ���ļ��в��������ļ������ļ���
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//File f = new File("d:\\a\\b,txt");  //����·��
		//File f2 = new File("a.txt");  //���·��
		
		//boolean createNewFile():  ��ָ���ļ�������ʱ�����ļ���������true�����򷵻�false
		//System.out.println(f2.createNewFile());
		
		//boolean mkdir()   :��ָ���ļ��в�����ʱ�����ļ���������true�����򷵻�false
		File f3 = new File("b");
		//System.out.println(f3.mkdir());
		
		//boolean mkdirs() :����ָ���ļ��У���ָ�����ļ��еĸ��ļ��в�����ʱҲ�������ļ���
		File f4 = new File("c\\d\\e");
		//System.out.println(f4.mkdirs());
		//boolean delete()  :ɾ��ָ�����ļ����ļ��е�ָ�����ļ��ļ��д���ʱɾ��������true��������ʱ����false
		System.out.println(f3.delete());
		System.out.println(f4.delete());
	}

}
