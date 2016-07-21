package ua.goit.java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class LogAspect {
    @Around("execution( * Runner.*(..))")
    public Object onExecute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("LogAspect. Start execution of method: " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        System.out.println("LogAspect. Stop execution of method: " + pjp.getSignature().getName());
        return result;
    }

}
