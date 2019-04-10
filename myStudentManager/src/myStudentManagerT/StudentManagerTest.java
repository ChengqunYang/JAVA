package myStudentManagerT;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 这是我的学生管理系统的主类
 * 
 * 
 * 
 * A：定义学生类
 * B：学生管理系统的主界面的代码编写
 * C: 学生管理系统的查看所有所以学生的代码编写
 * D：学生管理系统添加学生的代码编写
 * E：学生管理系统的删除学生的代码编写
 * F：学生管理系统的修改学生的代码编写
 */
public class StudentManagerTest {
	public static void main(String[] args) {
		//创建集合对象，用于存储学生数据
		ArrayList<Student> array = new ArrayList<Student>();
		while(true){ //为了是程序回到这里来，我们使用循环
			System.out.println("--------欢迎来到学生管理系统--------");
			System.out.println("1查看所有学生");
			System.out.println("2添加学生");
			System.out.println("3删除学生");
			System.out.println("4修改学生");
			System.out.println("5退出");
			System.out.println("请输入你的选择:");
			Scanner in = new Scanner(System.in);
			String choiceString = in.nextLine();
			switch(choiceString){
			case "1":
				//查看所有学生
				findAllStudent(array);
				break;
			case "2":
				//添加学生
				addStudent(array);
				break;
			case "3":
				//删除学生
				deleteStudent(array);
				break;
			case "4":
				//修改学生
				updateStudent(array);
				break;
			case "5":
				//退出
			default:
				System.out.println("谢谢你的使用！");
				System.exit(0);//JVM退出
				break;
			}
		}
	}
	//查看所有学生
	public static void findAllStudent(ArrayList<Student> array){
		//首先判断集合中是否有数据，如果没数据给提示，结束方法的继续执行
		if(array.size() == 0){
			System.out.println("不好意思，当前没有学生信息可查询，请回去重新选择你的操作");
			return;
		}
		//给出信息表表头
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		for(int x=0; x<array.size(); x++){
			Student s = array.get(x);
			System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	//添加学生
	public static void addStudent(ArrayList<Student>array){
		//创建键盘录入对象
		Scanner in = new Scanner(System.in);
		//为了让代码能够回到这里，用循环
		String id;
		while(true){
			System.out.println("请输入学生学号：");
			id = in.nextLine();
			//判断学号有没有被人占用
			boolean flag = false;
			for(int x=0;x<array.size();x++){
				Student s = array.get(x);
				if(s.getId().equals(id)){
					flag = true;//说明学号被占用
					break;
				}
			}
			if(flag){
				System.out.println("你输入的学号已经被占用，请重新输入");
			}else{
				break;//结束循环
			}
		}
		System.out.println("请输入学生姓名：");
		String name = in.nextLine();
		System.out.println("请输入学生年龄：");
		String age = in.nextLine();
		System.out.println("请输入学生居住地");
		String address = in.nextLine();
		//创建学生对象
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		//把学生对象作为元素添加到集合
		array.add(s);
		//添加成功给出提示
		System.out.println("添加学生成功！");
	}
	//删除学生
	public static void deleteStudent(ArrayList<Student> array){
		//键盘录入一个学号，到集合中去查找是否有学生使用的是该学号，如果有删除
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你要删除的学生的学号");
		String id = in.nextLine();
		//遍历集合
		int index = -1;
		for(int x=0;x<array.size();x++){
			//获取每一个学生对象
			Student s = array.get(x);
			if(s.getId().equals(id)){
				index = x;
				break;
			}
		}
		//给出提示
		if(index == -1){
			System.out.println("不好意思，你所要删除的学号对应的学生信息不存在，请回去重新选择！");
		}else{
			array.remove(index);
			System.out.println("删除学生成功！");
		}
	}
	//修改学生
	public static void updateStudent(ArrayList<Student> array){
		//键盘录入一个学号，到集合中去查找，如果有学生是该学号则修改其信息
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你要修改的学生的学号：");
		String id = in.nextLine();
		int index = -1;
		for(int x = 0;x<array.size();x++){
			//获取每一个学生对象
			Student s = array.get(x);
			if(s.getId().equals(id)){
				index = x;
				break;
			}
		}
		if(index ==-1){
			System.out.println("不好意思，你要修改的学号对应的学生信息不存在，请回去重新选择！");		
		}else{
			System.out.println("请输入学生新姓名");
			String name = in.nextLine();
			System.out.println("请输入学生新年龄");
			String age = in.nextLine();
			System.out.println("请输入学生新地址");
			String address = in.nextLine();
			//创建学生对象
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			array.set(index, s);
			//给出提示
			System.out.println("修改学生成功！");
		}
	}
}
