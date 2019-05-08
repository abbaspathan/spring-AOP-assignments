package com.capgemini.spring.test;
import com.capgemini.spring.calculator.*;
import org.springframework.context.support.*;
import org.springframework.context.*;

public class Main{
	
	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator=context.getBean(Calculator.class);
		try{
			System.out.println(calculator.divide(20,2));
		}catch(Exception e){}
	}
}