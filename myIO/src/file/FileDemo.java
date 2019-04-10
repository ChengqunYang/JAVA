package file;

import java.io.File;

/*
 * File���ļ���Ŀ¼·���ĳ��������ʽ��File���ʵ�����ɸı�
 * 
 * ���췽����
 * 		File(File parent,String child)
 * 		File(String pathname)
 * 		File(String parent,String child)
 * 
 * 
 * Flie�ĳ��ù��ܣ�
 * 		��������
 * 				boolean createNewFlie()
 * 				boolean mkdir()
 * 				boolean mkdirs()
 * 		ɾ������
 * 				boolean delete()
 * 		��ȡ����
 * 				File getAbsoluteFile()
 * 				String getAbsolutePath()
 * 				String getName()
 * 				String getParent()
 * 				File getParentFile()
 * 				String getPath()
 * 				long lastModified()
 * 				long length()
 * 		�жϹ���
 * 				boolean exists()
 * 				boolean isAbsolute()
 * 				boolean isDirectory()
 * 				boolean isFile()
 * 				boolean isHidden()
 * 		�޸ķ���
 * 				boolean renameTo(File dest)
 */
public class FileDemo {
	public static void main(String[] args) {
		//���췽����
		
		//File(String pathname) :��ָ����·����ת��Ϊһ��File����
		File f = new File("D:\\a\\b.txt");
		//����ָ�򣬲�������Ĳ�������ָ���ļ�������Ҳ���ᴴ��Ҳ�������
		//Flie(String parant,string child) :����ָ���ĸ�·�����ļ�·������File����
		File f2 = new File("D:\\a","b.txt");
		
		//File f3 = new File(File parent,String child):  ����ָ���ĸ�·�����ļ�·������File����
		File parent = new File("D:\\a");
		File f3 = new File(parent,"b.txt");
	}
}
