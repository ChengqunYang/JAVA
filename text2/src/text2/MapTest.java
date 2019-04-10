package text2;

import java.util.HashMap;
import java.util.Map;

/*
 * ����ʵ��ѧ�����������ж�Ӧ��ϵ�����ݴ洢
 * 
 * 		Ϊ��ʵ�������ж�Ӧ��ϵ�����ݣ�����֮ǰ��ѧϰ�������ǿ���ʵ�ֵģ����ǲ��Ǻܷ���
 * 		javaΪ�����ṩ��һ���µ��������ͣ�ר�����ڴ洢��Ӧ��ϵ�ļ���
 * 		Map:����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ��
 * 			�ӿ� Map<K,V>
		 	���Ͳ�����
				K - ��ӳ����ά���ļ�������
				V - ӳ��ֵ������
		Map��Collection��ʲô����
		Map:��һ��˫�м��ϣ������ڴ����ж�Ӧ��ϵ�����ݣ�key�ǲ������ظ��ģ�����Ҳ��Ϊ���޶Լ���
		Collection:�ǵ��м��ϣ�Collection�в�ͬ������ϵ���е������ظ������������еĲ������ظ���������������������Ҳ����Ϊ��������
 * 
 * һ��һ��
 * 		һ��ѧ�Ŷ�Ӧһ������
 */
/*
 * Map�ĳ��ù��ܣ�
 * 		ɾ�����ܣ�	
 * 					void clear()  �Ӵ�ӳ�����Ƴ�����ӳ���ϵ����ѡ��������
 * 					V remove(Object key) �������һ������ӳ���ϵ������Ӵ�ӳ�����Ƴ�����ѡ��������
 * 		�жϹ��ܣ�
 * 					boolean isEmpty() �����ӳ��δ������-ֵӳ���ϵ���򷵻� true�� 
 * 					boolean containsKey(Object key) �����ӳ�����ָ������ӳ���ϵ���򷵻� true��
 * 					boolean containsValue(Object value) �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true��
 * 		�������ܣ�
 * 					Set<Map.Entry<K,V>> entrySet() ���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ�� 
 *		��ȡ���ܣ�	
 *					V get(Object key)  ����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null�� 
 *					int size() ���ش�ӳ���еļ�-ֵӳ���ϵ���� 
 *		ӳ�书�ܣ�
 *					 V put(K key, V value) ��ָ����ֵ���ӳ���е�ָ������������ѡ�������� 
 *
 */

public class MapTest {
	public static void main(String[] args) {
	//����Map����
		Map<String,String> map = new HashMap<String,String>();
		
		//V put(K key,V value)    //���ǽ�keyӳ�䵽value�Ĺ��ܣ����key���ڣ��򸲸�value������ԭ����value����
		System.out.println(map.put("xh001", "����"));
		System.out.println(map.put("xh002", "����"));
		System.out.println(map.put("xh003", "����"));
		
		//boolean containsKey(Object key) //�ж�ָ����key�Ƿ����
		System.out.println(map.containsKey("xh001"));
		//boolean containsValue(Object value):�ж�ָ����value�Ƿ����
		System.out.println(map.containsValue("����"));
		
		//void clear()  //������еĶ�Ӧ��ϵ
		//map.clear();
		
		//V remove(Object key)//����ָ����keyɾ����Ӧ��ϵ��������key����Ӧ��ֵ�����û��ɾ���ɹ��򷵻�null
		System.out.println(map.remove("xh002"));
		//boolean isEmpty() //�ж��Ƿ��ж�Ӧ��ϵ
		System.out.println(map.isEmpty());
		//int size()  //���ض�Ӧ��ϵ�ĸ���
		System.out.println(map.size());
		// V get(object key)  //����ָ��key�Ķ�Ӧvalue
		System.out.println(map.get("xh001"));
		System.out.println(map);
		
	}
}
