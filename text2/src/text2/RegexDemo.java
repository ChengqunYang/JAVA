package text2;
/*
 * 校验qq号码
 * 		要求必须是5-15位
 * 		0不能开头
 * 		必须都是数字
 *  
 * 正则表达式：  一套规则，可以用于匹配字符串
 * 		boolean matches(String regex):判断当前字符串是否匹配指定的正则表达式，匹配返回true，不匹配返回false
 * 
 * 常用的正则表达式字符
 * 字符：
 * x 字符 x
 * \\ 反斜线字符
 * 字符类：
 *  [abc] a、b 或 c（简单类） 
 *  [^abc] 任何字符，除了 a、b 或 c（否定 ）
 *  [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
 *  预定义字符类 
. 任何字符（与行结束符可能匹配也可能不匹配） 
\d 数字：[0-9] 
\D 非数字： [^0-9] 
\s 空白字符：[ \t\n\x0B\f\r] 
\S 非空白字符：[^\s] 
\w 单词字符：[a-zA-Z_0-9] 
\W 非单词字符：[^\w] 

Greedy 数量词 
X? X，一次或一次也没有 
X* X，零次或多次 
X+ X，一次或多次 
X{n} X，恰好 n 次 
X{n,} X，至少 n 次 
X{n,m} X，至少 n 次，但是不超过 m 次 

 */

public class RegexDemo {
	public static void main(String[] args) {
		String qq = "123423565464";
		/*boolean flag = checkQQ(qq);
		System.out.println(flag);
		*/
		boolean flag = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag);
	}
	/*public static boolean checkQQ(String qq) {
		int length = qq.length();
		if(length <5|| length>15){
			return false;
		}
		//0不能开头
		if(qq.startsWith("0")){
			return false;
		}
		for (int i = 0; i < length; i++){
			//得到每一个字符
			char c = qq.charAt(i);
			if(c < '0'||c > '9'){
				return false;
			}
		}
		
		
		return true;//符合要求
		}
		*/
}
