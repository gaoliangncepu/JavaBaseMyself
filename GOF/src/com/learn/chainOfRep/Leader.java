package com.learn.chainOfRep;

/**
 * 业务节点抽象父类
 * 
 * 此处定义成抽象父类比抽象接口好;定义所有业务节点的公共属性和建立责任链的公共方法。
 * @author Administrator
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	/*
	 * 指定下一个处理者，建立责任链
	 */
	public void pointNextLeader(Leader leader) {
		this.nextLeader = leader;
	}
	
	public abstract void response(Request request);
}
