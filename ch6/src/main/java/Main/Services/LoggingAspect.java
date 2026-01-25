package Main.Services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* Main.Services.*.*(..))")
    public void Log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method executed");
    }
}
