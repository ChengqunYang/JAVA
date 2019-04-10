package objectio;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 对象操作流：可以用于读写任意类型的对象
 * 			ObjectOutputStream
 * 					writeObject
 * 					ObjectOutputStream(OutputStream out)
 * 			ObjectInputStream
 * 					readObject
 * 					ObjectInputStream(InputStream in)
 * 
 * 注意：使用对象输出流来写出对象，只能用对象输入流来读取对象
 * 		 只能将支持java.io.Serializable接口的对象写入流中
 * java.io.Serializable:序列号：是一个标识接口，只起标识作用，没有方法
 * 								当一个类的对象需要IO流进行数据读写的时候，这个类必须实现该接口
 * 
 * 使用对象输出流来写对象和使用对象输入流来读取对象
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//method();    //把对象写入到文件中
		//创建对象输入流的对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		/*//读取对象
		Object obj = ois.readObject();
		System.out.println(obj);
		
		Object obj2 = ois.readObject();
		System.out.println(obj2);
*/		
		try {
			while(true) {
				Object obj = ois.readObject();
				System.out.println(obj);
			}
		} catch(EOFException e) {
			System.out.println("读到了文件末尾");
		}
		//释放资源
		ois.close();
	}

	private static void method() throws IOException {
		//创建对象输出流的对象
		//FileOutputStream fos = new FileOutputStream("a.txt");
		//ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
		//创建学生对象
		Student s = new Student("张三", 15);
		Student s2 = new Student("李四",18);
		//写出学生对象
		oos.writeObject(s);
		oos.writeObject(s2);
		//释放资源
		oos.close();
	}
}
