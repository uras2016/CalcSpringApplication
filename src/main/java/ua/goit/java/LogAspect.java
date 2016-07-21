package ua.goit.java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect {
    @Around("execution( * Calculator.*(..))")
    public Object onExecute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("LogAspect. Before execution of: " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        System.out.println("LogAspect. After execution of: " + pjp.getSignature().getName());
        return result;
    }
}
