package com.danandreicarp.learn.designpatterns.strategy;

public class StrategyClient {

	public static void main(final String[] args) {
		final IStrategy strategy = new StrategyA();
		final Context context = new Context(strategy);

		context.operation();

		context.setStrategy(new StrategyB());
		context.operation();
	}

}
