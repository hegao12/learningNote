package com.abc.spring.bean.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
//		Car car1 = (Car) ctx.getBean("car1");
//		System.out.println(car1);
		Car	car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
	}
}
