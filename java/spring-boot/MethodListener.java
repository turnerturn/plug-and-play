package com.turndawg.toolbox;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;

/**
* To create a Spring component that listens for a method being called, you can use the @Aspect annotation along with the @Before annotation.
*/
@Aspect
public class MethodListener {
    
/**
 * This MethodListener class will be triggered before any method in the com.example.service package is called.
**/
    @Before("execution(* com.example.service.*.*(..))")
    public void listenForAllMethodsInPackage() {
        // do something before the method is called
    }

/**
* You can customize the pointcut expression to specify which methods you want to listen for.
* For example, the following pointcut expression will only trigger the listener for methods in the com.example.service.MyService class:
**/
    @Before("execution(* com.example.service.MyService.*(..))")
    public void listenForAllMethodsInMyServiceTriggerBeforeMethodExecution() {
        // do something before the method is called
    }

/**
 * You can also use the @After annotation to trigger the listener after the method is called.
**/
    @After("execution(* com.example.service.MyService.*(..))")
    public void listenForAllMethodsInMyServiceTriggerAfterMethodExecution() {
        // do something before the method is called
    }
    
   /**
   * You can also use the @Around annotation to trigger the listener both before and after the method is called.
   **/
    @Around("execution(* com.example.service.MyService.*(..))")
    public void listenForAllMethodsInMyServiceTriggerBeforeAndAfterMethodExecution() {
        // do something before the method is called
    }
}


