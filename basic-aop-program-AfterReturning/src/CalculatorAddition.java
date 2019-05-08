package com.capgemini.spring.calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorAddition implements Calculator{

	public int add(int num1,int num2){
		return num1+num2;
	}	
}