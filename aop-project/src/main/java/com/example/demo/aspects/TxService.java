package com.example.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
	
	//@Pointcut("execution(public String com.example.demo.aspects.EmployeeDao.saveEmployee())")
	//@Pointcut("execution(* com.example.demo.aspects.EmployeeDao.*() )")
	@Pointcut("@annotation(com.example.demo.aspects.MyTx)")
	public void p1()
	{
		
	}
	@Around("p1()")
	public void aroundTest(ProceedingJoinPoint joinPoint)
	{
		System.out.println("before business method");
		
		//code for calling business method
		try {
			//on success
			
		Object ob=	joinPoint.proceed();
		System.out.println("Data is:"+ob);//for return value in employee dao
		}
			
		catch (Throwable e) {
			//on failure
			
			e.printStackTrace();
		}
		//at any case
		System.out.println(("after business method"));
	}
	
	/*
	 * @Before("p1()") //joinpoint public void beginTx() {
	 * System.out.println("Tx started...."); }
	 * 
	 * @AfterReturning(value = "p1()",returning = "ob") //joinpoint public void
	 * commitTx(Object ob) { System.out.println("Tx commited"); }
	 * 
	 * @AfterThrowing(value = "p1()",throwing="th") public void rollbackTx(Throwable
	 * th) { System.out.println("Tx is rollback:"+th.getMessage()); }
	 * 
	 * @After("p1()") public void sendReport() {
	 * System.out.println("Report is sent"); }
	 */
}
