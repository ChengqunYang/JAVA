package test;
import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;



public class XpathTest {
	public static void main(String[] args) {
		
		try {
			//1.����sax��ȡ����
			SAXReader reader  = new SAXReader();
			//2.ָ��������xmlԴ
			Document document = reader.read(new File("src/xml/stus.xml"));
			//3.�õ���Ԫ��
			Element rootElement = document.getRootElement();
			//dom4j ����֧��Xpath��д����xpath��ʵ��xml��·�����ԣ�֧�������ڽ���xmlʱ���ܹ����ٵĶ�λ�������ĳ��Ԫ�ء�
			//Ҫ��ʹ��Xpath,���õ���֧�ֵ�jar
			
			//���ص��ǵ�һ�ĵ�һ��Ԫ��
			Element nameElement = (Element) rootElement.selectSingleNode("//name");
				System.out.println(nameElement.getText());
			//����һ���ڵ��б� 
			List<Element> list = rootElement.selectNodes("//name");
			for (Element element : list) {
				System.out.println(element.getText());
			}
  		} catch (DocumentException e) {
 
			e.printStackTrace();
		}
	}
}
