package test;

import java.util.Scanner;

/**
 * 计算从0到某一整数之间所有整数的各位数字之和
 * @author DELL
 *
 */
public class Test {
	public static void main(String[] args) {
		/*int a = 1234;
		int sum = 0; 
		for(int i = 0; i <= a; i++){
			int s = i/1000 + i%1000/100 + i%1000%100/10 + (i%1000%100%10);
					sum += s;
		}
		System.out.println(sum);*/
		 Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int  sum = 0;
			for(;n >= 0; n--){
				int r = n;
				while(r != 0){
					int p = r%10;
					sum += p;
					r = r/10;
				}
			}
			System.out.println(sum);
		
	}

}




