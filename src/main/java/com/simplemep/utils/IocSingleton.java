package com.simplemep.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocSingleton {

	private static ClassPathXmlApplicationContext context = null;
	
	public static Object getBean(String key){
		if(context==null) initContext();
		Object bean = context.getBean(key);
		if(bean!=null) return context.getBean(key);
		return null;
	}
	
	private static void initContext (){
		context = new ClassPathXmlApplicationContext("SimpleMEPContext.xml");
	}
	
}
