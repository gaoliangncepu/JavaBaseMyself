package com.learn.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 真实对象处理器
 * 用户通过代理角色调用接口方法时，方法执行入口都是此处的invoke()方法！通过反射机制调用传入真是角色的指定方法。
 * @author Administrator
 *
 */
public class StarHandler implements InvocationHandler {
	private RealStar star;

	
	public StarHandler(RealStar star) {
		super();
		this.star = star;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		
		System.out.println("真正的方法执行前！");
		System.out.println("面谈，签合同，预付款，订机票");//代理对象的附加业务逻辑
		
		if(method.getName().equals("sing")){
			// 【重点】此处必须激活被代理对象的方法
			object = method.invoke(star, args);
		}
		System.out.println("真正的方法执行后！");
		System.out.println("收尾款");
		
		return object;
	}

}
