package dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 因为装饰者模式有弊端(当一个被装饰的类有很多方法时一个一个实现很麻烦)
 * 所以我们采用动态代理模式(我们手动的让jdk在内存里创建装饰类)
 * 
 */
import java.lang.reflect.Proxy;

public class TestCar {
	public static void main(String[] args) {
		
		/**
		 * 字节码加载器：jdk中有一些程序，专门将各种字节码文件加载到内存，这类程序简称为字节码加载器
		 * 如何将字节码文件.class文件加载到内存？
		 * 底层实现过程:利用io流技术，获取到文件中的数据加载到内存
		 * 字节码加载器：（类加载器）
		 * 		引导类加载器：由于String.class,int.class等字节码文件需要频繁的被加载到内存，速度必须快，底层用其他语言实现（C,C++）
		 * 		扩展类加载器：extension
		 * 		应用类加载器：自己写的 类 的加载器    程序员实现的所有的类都属于应用类
		 * 	使用：类.class.getClassLoader()
		 */
		
		/**
		 * 第一个参数: 固定值,告诉虚拟机用哪个字节码加载器加载内存中创建出的字节码文件
		 * 第二个参数: 告诉虚拟机,内存中正在被创建的字节码文件中应该有哪些方法
		 * 第三个参数: 告诉虚拟机正在被创建的字节码上的各个方法如何来处理
		 */
		//创建代理对象
		Icar car = (Icar) Proxy.newProxyInstance(TestCar.class.getClassLoader(), GoogleCar.class.getInterfaces(), new InvocationHandler(){
			//method:代表正在执行的方法
			//args:代表正在执行的方法中的参数
			//object:代表方法执行完毕之后的返回值.
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//method代表当前正在执行的每个方法
				//object 代表每个方法执行完返回的对象
				if(method.getName().equalsIgnoreCase("start")){
					System.out.println("检查天气是否良好");
					method.invoke(new GoogleCar(), args);
					System.out.println("检查路况是否拥堵");
				}else{
					method.invoke(new GoogleCar(), args);
				}
	
				return null;
			}
		});
		car.start();
		car.run();
		car.stop();
	}
}
