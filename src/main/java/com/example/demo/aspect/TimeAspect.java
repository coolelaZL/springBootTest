package com.example.demo.aspect;

import com.example.demo.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
    @Around("execution(* com.example.demo.controller.FastjsonController..*(..))")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("=====Aspect处理=======");
        Object[] args = pjp.getArgs();
        System.out.println("length=="+args.length);
        for (Object arg : args) {
            System.out.println("参数为:" + arg);
        }

        long start = System.currentTimeMillis();

        Object object = pjp.proceed();
        User user = (User) object;
        System.out.println(user.getUsername());
        System.out.println("Aspect 耗时:" + (System.currentTimeMillis() - start));

        return object;
    }
}
