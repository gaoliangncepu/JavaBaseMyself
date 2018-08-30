package com.learn.mediator;

public class Development implements Department{
	private Mediator mediator;

	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("汇报工作！没钱了，需要资金支持！");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("专心科研，开发项目！");
	}
	
}
