package myexception;

import java.io.FileWriter;
import java.io.IOException;

import javax.management.RuntimeErrorException;

/*
 * 异常的分类：
 * 			运行时异常:RuntimeException 的子类就是运行时期异常，在编译期间可以自由选择处理或者不处理。
 * 			编译时异常:是Exception 的子类，非RuntimeException的子类在编译时期必须处理
 *			
 *
 *需求：写一个方法，接受考试成绩，如果考试成绩的范围在0——100之前则属正常，否则属于异常
 *
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
	/*boolean flag = checkScore(-10);
	System.out.println(flag);*/
		checkScore(111);
	}
	/*public static boolean checkScore(int score) {
		//判断成绩是否符合范围，如果不符合则返回false
		if(score < 0 || score >100) {
			return false;
		}
		//符合
		return true;
	} */
	public static void checkScore(int score) {
		if(score < 0 || score >100){
			throw new RuntimeException("考试成绩不符合要求");
		}
		System.out.println("考试成绩符合要求");
	}
 }
