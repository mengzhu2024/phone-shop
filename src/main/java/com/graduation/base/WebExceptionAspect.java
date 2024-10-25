package com.graduation.base;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebExceptionAspect {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Around("@within(webException)")
    public Object doAround(ProceedingJoinPoint pjp, WebException webException) throws Throwable {
        try {
            return pjp.proceed();
        } catch (DuplicateKeyException e) {
            WebResult<?> webResult = new WebResult<>(null);
            webResult.setCode(1);
            webResult.setMsg("数据已存在");
            return webResult;
        } catch (Exception e) {
            log.error("", e);
            WebResult<?> webResult = new WebResult<>(null);
            webResult.setCode(1);
            webResult.setMsg(e.getMessage());
            return webResult;
        }
    }

}
