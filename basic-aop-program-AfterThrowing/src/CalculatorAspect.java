package com.capgemini.spring.aspects;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class CalculatorAspect{
	
	@AfterThrowing(pointcut="execution (* com.capgemini.spring.calculator.CalculatorDivide.divide(..))",throwing="exp")
	public void log(ArithmeticException exp)throws Throwable{
		System.out.println("exception : cant't divide by zero ");
	}
}