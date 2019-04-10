package text2;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties:��ʾ��һ���־õ����Լ��������б���ÿһ���������Ӧֵ����һ���ַ���
 * 
 * ���췽����
 * 		Properties()
 * 
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//���������б����
		Properties prop = new Properties();
		//���ӳ���ϵ
		prop.put("CZBK001", "zhangsan");
		prop.put("ZCBK002", "lisi");
		prop.put("ZCBK003", "wangwu");
		//���������б�
		//��ȡ���е�key,ͨ��key��ȡ���е�value
		Set<Object> keys = prop.keySet();
		for(Object key : keys) {
			Object value = prop.get(key);
			System.out.println(key + "=" + value);
		}
		//��ȡ���еĽ��֤����
		System.out.println("--------");
		Set<Map.Entry<Object, Object>> entrys = prop.entrySet();
		for(Map.Entry<Object, Object> entry : entrys) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"="+value);
		}
		
	}
}
