package myAPIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把array.txt中的数据读取出来存储到集合中，然后遍历集合，在控制台输出
 * 
 * 
 * 分析：
 * 		A：定义学生类
 * 		B：创建输入缓冲流对象
 * 		C：创建集合对象
 * 		D：读取文件数据，并按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合中去
 * 			001，向问天，30，北京
 * 		E：释放资源
 * 		F：遍历集合，打印
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		
		//创建集合对象
		ArrayList<Student> array =  new ArrayList<Student>();
		//读取文件数据，并按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合中去
			
		String line;
		while((line=br.readLine())!=null){
			String[] strArray = line.split(",");
			Student s = new Student();
			s.setId(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(strArray[2]);
			s.setAddress(strArray[3]);
			//把学生对象作为元素存储到集合中
			
			array.add(s);
		}
		br.close();
		
		//遍历集合
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		for(int x=0; x<array.size(); x++){
		Student s = array.get(x);
		System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress()+"\t");
		}
		
	}
}
