package com.capgemini.spring.calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorDivide implements Calculator{

	public int divide(int num1,int num2){
		return num1/num2;
	}	
}