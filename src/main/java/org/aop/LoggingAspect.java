package org.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* org.aop.ShoppingCart.checkout(..))")
	public void beforeLogger(JoinPoint jp) {
//		System.out.println(jp.getSignature());
		String arg = jp.getArgs()[0].toString();
		System.out.println("before loggers with argument " + arg);
	}

	@After("execution(* *.*.*.checkout(..))")
	public void afterLogger() {
		System.out.println("after loggers");
	}

	@Pointcut("execution(* org.aop.ShoppingCart.quantity(..))")
	public void afterReturningCut() {

	}

	@AfterReturning(pointcut = "afterReturningCut()", returning = "retVal")
	public void afterReturning(String retVal) {
		System.out.println("After returning " + retVal);
	}
}
