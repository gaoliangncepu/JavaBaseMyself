package com.learn.strategy;

/**
 * 策略接口
 * 将策略的定义与维护与逻辑判断分离开来，便于策略的扩展。
 * @author Administrator
 *
 */
public interface Strategy {
	double getPrice(double standardPrice);
}
