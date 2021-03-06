package singleton;

public class TestStu {
	public static void main(String[] args) {
		Stu stu1 = Stu.getInstance();
		Stu stu2 = Stu.getInstance();
		Stu stu3 = Stu.getInstance();
		
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		
		/**
		 * 	singleton.Stu@15db9742
			singleton.Stu@15db9742
			singleton.Stu@15db9742
				打印的是同一个对象
		 */
		
		
		Stu01 stu011 = Stu01.getInstance() ;
		Stu01 stu012 = Stu01.getInstance() ;
		Stu01 stu013 = Stu01.getInstance() ;
		
		System.out.println(stu011);
		System.out.println(stu012);
		System.out.println(stu013);
		
		/**
		 * 	singleton.Stu01@6d06d69c
			singleton.Stu01@6d06d69c
			singleton.Stu01@6d06d69c
			打印的是同一个对象
		 */
	}
	
}
