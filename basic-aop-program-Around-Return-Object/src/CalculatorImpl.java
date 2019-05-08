package com.capgemini.spring.calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator{

	public Integer add(Integer num1,Integer num2){
		return num1+num2;
	}
	
	public Integer divide(Integer num1,Integer num2){
		return num1/num2;
	}	
}