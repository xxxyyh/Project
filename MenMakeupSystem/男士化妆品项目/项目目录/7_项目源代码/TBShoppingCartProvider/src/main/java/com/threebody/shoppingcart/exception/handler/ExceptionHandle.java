package com.threebody.shoppingcart.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.threebody.shoppingcart.aspect.HttpAspect;
import com.threebody.shoppingcart.entity.JsonResult;
import com.threebody.shoppingcart.exception.WebException;


@ControllerAdvice
public class ExceptionHandle {
	
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	
	//用来处理系统异常
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public JsonResult handler(Exception e) {
		logger.error("【系统异常】：",e);
		return new JsonResult(-1,e.getMessage());
	}
	
	
	//用来处理逻辑异常
	@ExceptionHandler(value=WebException.class)
	@ResponseBody
	public JsonResult webHandler(WebException e) {
		logger.error("【操作异常】：{}",e.getMessage());
		return new JsonResult(e.getCode(),e.getMessage());
	}
}
