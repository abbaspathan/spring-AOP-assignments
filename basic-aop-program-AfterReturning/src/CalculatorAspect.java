package com.capgemini.spring.aspects;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class CalculatorAspect{
	
	@AfterReturning(pointcut="execution (* com.capgemini.spring.calculator.CalculatorAddition.add(..))",returning="var")
	public void log(int var)throws Throwable{
		System.out.println("Add success...");
	}
}