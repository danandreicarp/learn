package com.danandreicarp.learn.designpatterns.flyweight;

public class FlyweightClient {

	private final IFlyweight flyweight;
	private final ExtrinsicState extrinsicState;

	public FlyweightClient(final String name) {
		flyweight = FlyweightFactory.getFlyweight(name);
		extrinsicState = new ExtrinsicState(0);
	}

	public void statefulOperation(final ExtrinsicState extrinsicState) {
		// handled by flyweight object
		flyweight.statefulOperation(extrinsicState);

		// handled by client
		this.extrinsicState.setCounter(this.extrinsicState.getCounter() + 1);
	}

	public IFlyweight getFlyweight() {
		return flyweight;
	}
}
