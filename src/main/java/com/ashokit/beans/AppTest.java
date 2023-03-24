package com.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		
		PaymentsService payment=context.getBean(PaymentsService.class);
		payment.doPayments();

	}

}
