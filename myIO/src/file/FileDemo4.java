package file;

import java.io.File;
import java.util.Date;

/*
 * ��ȡ����:
 * 			File getAbsoluteFile()
 * 			String getAbsolutePath()
 * 			String getName()
 * 			String getParent()
 *			File getParentFile()
 *			String getPath()
 * 			long lastModified()
 * 			long length()
 * �޸ķ���:
 * 			boolean renameTo(File dest)
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File f = new File("a.txt");
		File f2 = new File("c","d");
		File f3 = new File("c","e");
		
		
		//File getAbsulateFile();     //��File�������ʽ���ص�ǰFile������ָ��ľ���·��
		//String getAbsulatePath();  //����File������ָ��ľ���·��
		//System.out.println(f.getAbsoluteFile());
		//System.out.println(f.getAbsolutePath());
		
		//String getParent()  :����File����ĸ�·��
		//File getParentFile() ����File�������ʽ���ص�ǰFile����ĸ�·��
		//System.out.println(f2.getParent()); 
		//System.out.println(f2.getParentFile());
		
		//String getName()  //��ȡ�ļ������ļ��е�����
		//String getPath()  //��ȡ����File����ʱ����·��
		//long lastModified() //�Ժ���ֵ����ʽ��������޸�ʱ��
		//long length()   //�����ļ����ֽ���
		System.out.println(f.getName());
		System.out.println(f2.getName());
		
		System.out.println(f.getPath());
		System.out.println(f2.getPath());
		
		System.out.println(f.lastModified());
		Date d  = new Date(1542860824778l);
		System.out.println(d.toLocaleString());
		
		System.out.println(f.length());
		System.out.println(f2.length());//�޷�ͨ�����������ȡ�ļ��е��ֽ���
		
		//boolean renameTo(File dest) :����ǰFile������ָ���·�� �޸�Ϊ�ƶ�File��ָ���·��
		//ע�⣺�޸ĵ��ļ���·�����ܴ��ڣ������������޸�ʧ��
		System.out.println(f2.renameTo(f3));
	}
}
