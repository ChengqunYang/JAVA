package spring.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("customerService") //<bean id="customerService" class="" init-method="init" destory-method="destory"/>
//@Scope("prototype")
public class CustomerService {
	
	@PostConstruct//相当于init-method
	public void init(){
		System.out.println("CustomerService被初始化了");
	}
	
	public void save(){
		System.out.println("Service的save方法执行了...");
	}
	@PreDestroy//相当于的story-method
	public void dstory(){
		System.out.println("CustomerService被销毁了...");
	}
}
