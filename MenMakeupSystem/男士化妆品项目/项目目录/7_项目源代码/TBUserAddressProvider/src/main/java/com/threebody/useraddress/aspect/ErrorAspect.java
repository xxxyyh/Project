package com.threebody.useraddress.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.threebody.useraddress.exception.WebException;
import com.threebody.useraddress.exception.enums.ErrorEnum;

@Aspect
@Component
public class ErrorAspect {
	
	private final static Logger logger = LoggerFactory.getLogger(ErrorAspect.class);

	@Pointcut("execution(public * com.bs.service.*.*(..))")
	public void error() {}
	
	@AfterReturning(pointcut = "error()",returning = "ret")
	public void returnCheck(JoinPoint point,Object ret) {
		String methodName = point.getSignature().getName().toLowerCase();
		if(ret!=null) {
			if(ret instanceof Boolean) {
				boolean retValue = ((Boolean)ret).booleanValue();
				if(!retValue) {
					if(methodName.indexOf("add")!=-1||methodName.indexOf("insert")!=-1) {
						throw new WebException(ErrorEnum.ADD_FAIL);
					}else if(methodName.indexOf("remove")!=-1||methodName.indexOf("delete")!=-1) {
						throw new WebException(ErrorEnum.REMOVE_FAIL);
					}else if(methodName.indexOf("edit")!=-1||methodName.indexOf("update")!=-1) {
						throw new WebException(ErrorEnum.EDIT_FAIL);
					}
				}
			}
		}else {
			if(methodName.indexOf("find")!=-1||methodName.indexOf("query")!=-1) {
				throw new WebException(ErrorEnum.FIND_NULL);
			}
		}
	}
}
