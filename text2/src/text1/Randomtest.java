package text1;

import java.util.Random;
import java.util.Scanner;

public class Randomtest {
	public static void main(String[] args) {	
		Random r = new Random();
		int number = r.nextInt(100)+1;
		while(true)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("请输入你猜的数据");
			int guessNumber = in.nextInt();
			if(guessNumber>number)
			{
				System.out.println("你猜的数"+guessNumber+"大了");
			}
			else if(guessNumber<number)
			{
				System.out.println("你猜的数"+guessNumber+"小了");
			}else{
				System.out.println("恭喜你，你猜中了");
				break;
			}
				in.close();
		}
	}
}
