package test;

import java.io.File;

/*
 * �������ָ��Ŀ¼�����е�java�ļ�����������Ŀ¼��
 */
public class FlieTest {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\DELL\\Desktop\\java��ϰ\\text2\\src");
		method(f);
	}
	
	public static void method(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				//�ж��Ƿ����ļ�����
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}else {
					//��һ���ļ��Ļ�
					method(f);
				}
				
			}
		}
	}

}
