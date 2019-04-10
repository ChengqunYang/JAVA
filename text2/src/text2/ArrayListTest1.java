package text2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest1 {
	private static Scanner in;
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		addStudent(array);
		addStudent(array);
		for(int x=0;x<array.size();x++){
			Student s = array.get(x);
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
	public static void addStudent(ArrayList<Student>array){
	in = new Scanner(System.in);
	System.out.println("请输入学生姓名：");
	String name = in.nextLine();
	System.out.println("请输入学生年龄：");
	String age = in.nextLine();
	Student s = new Student();
	s.setName(name);
	s.setAge(age);
	array.add(s);
	}
}
