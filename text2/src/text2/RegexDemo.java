package text2;
/*
 * У��qq����
 * 		Ҫ�������5-15λ
 * 		0���ܿ�ͷ
 * 		���붼������
 *  
 * ������ʽ��  һ�׹��򣬿�������ƥ���ַ���
 * 		boolean matches(String regex):�жϵ�ǰ�ַ����Ƿ�ƥ��ָ����������ʽ��ƥ�䷵��true����ƥ�䷵��false
 * 
 * ���õ�������ʽ�ַ�
 * �ַ���
 * x �ַ� x
 * \\ ��б���ַ�
 * �ַ��ࣺ
 *  [abc] a��b �� c�����ࣩ 
 *  [^abc] �κ��ַ������� a��b �� c���� ��
 *  [a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
 *  Ԥ�����ַ��� 
. �κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
\d ���֣�[0-9] 
\D �����֣� [^0-9] 
\s �հ��ַ���[ \t\n\x0B\f\r] 
\S �ǿհ��ַ���[^\s] 
\w �����ַ���[a-zA-Z_0-9] 
\W �ǵ����ַ���[^\w] 

Greedy ������ 
X? X��һ�λ�һ��Ҳû�� 
X* X����λ��� 
X+ X��һ�λ��� 
X{n} X��ǡ�� n �� 
X{n,} X������ n �� 
X{n,m} X������ n �Σ����ǲ����� m �� 

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
		//0���ܿ�ͷ
		if(qq.startsWith("0")){
			return false;
		}
		for (int i = 0; i < length; i++){
			//�õ�ÿһ���ַ�
			char c = qq.charAt(i);
			if(c < '0'||c > '9'){
				return false;
			}
		}
		
		
		return true;//����Ҫ��
		}
		*/
}
