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
			System.out.println("��������µ�����");
			int guessNumber = in.nextInt();
			if(guessNumber>number)
			{
				System.out.println("��µ���"+guessNumber+"����");
			}
			else if(guessNumber<number)
			{
				System.out.println("��µ���"+guessNumber+"С��");
			}else{
				System.out.println("��ϲ�㣬�������");
				break;
			}
				in.close();
		}
	}
}
