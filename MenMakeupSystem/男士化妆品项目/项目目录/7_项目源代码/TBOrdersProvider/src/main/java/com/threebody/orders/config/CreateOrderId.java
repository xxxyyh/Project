package com.threebody.orders.config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CreateOrderId {
	public static String getOrderId() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String newDate=sdf.format(new Date());
		Date d1 = new Date();
		System.out.println(d1);
		String result="";
		Random random=new Random();
		for(int i=0;i<4;i++){
			result+=random.nextInt(10);
		}
		String orderid = newDate+result;
		System.out.println(orderid);
		System.out.println(orderid.length());
		return orderid;
	}
}
