package com.learn.chainOfResp;

/**
 * 主任
 * @author Administrator
 *
 */
public class Director extends Leader {
	
	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 处理业务逻辑
	 * 若不满足处理条件则传递给下一个处理者
	 */
	@Override
	public void response(Request request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()<3){
			System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.out.println("主任："+this.name+",审批通过！");
		}else{
			if(this.nextLeader!=null){
				this.nextLeader.response(request);
			}
		}
	}

}
