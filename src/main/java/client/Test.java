package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		Car c= appContext.getBean(Car.class);
		System.out.println(c);
		((ClassPathXmlApplicationContext)appContext).close();
	}

}
