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
			//1.创建sax读取对象
			SAXReader reader  = new SAXReader();
			//2.指定解析的xml源
			Document document = reader.read(new File("src/xml/stus.xml"));
			//3.得到根元素
			Element rootElement = document.getRootElement();
			//dom4j 里面支持Xpath的写法，xpath其实是xml的路径语言，支持我们在解析xml时，能够快速的定位到具体的某个元素。
			//要想使用Xpath,还得导入支持的jar
			
			//返回的是单一的第一个元素
			Element nameElement = (Element) rootElement.selectSingleNode("//name");
				System.out.println(nameElement.getText());
			//返回一个节点列表 
			List<Element> list = rootElement.selectNodes("//name");
			for (Element element : list) {
				System.out.println(element.getText());
			}
  		} catch (DocumentException e) {
 
			e.printStackTrace();
		}
	}
}
