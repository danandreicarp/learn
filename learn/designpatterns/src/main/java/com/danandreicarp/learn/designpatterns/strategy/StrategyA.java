package com.danandreicarp.learn.designpatterns.strategy;

public class StrategyA implements IStrategy {

	@Override
	public void execute() {
		System.out.println("using strategy A");
	}

}
