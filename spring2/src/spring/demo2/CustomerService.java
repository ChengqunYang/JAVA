package spring.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("customerService") //<bean id="customerService" class="" init-method="init" destory-method="destory"/>
//@Scope("prototype")
public class CustomerService {
	
	@PostConstruct//�൱��init-method
	public void init(){
		System.out.println("CustomerService����ʼ����");
	}
	
	public void save(){
		System.out.println("Service��save����ִ����...");
	}
	@PreDestroy//�൱�ڵ�story-method
	public void dstory(){
		System.out.println("CustomerService��������...");
	}
}