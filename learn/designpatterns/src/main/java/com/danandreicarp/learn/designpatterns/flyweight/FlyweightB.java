package com.danandreicarp.learn.designpatterns.flyweight;

public class FlyweightB implements IFlyweight {

	public IntrinsicState intrinsicState;

	public FlyweightB(final IntrinsicState intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void statefulOperation(final ExtrinsicState extrinsicState) {
		System.out.println("type two " + intrinsicState + " " + extrinsicState);
	}

	@Override
	public IntrinsicState getIntrinsicState() {
		return intrinsicState;
	}

	@Override
	public void setIntrinsicState(final IntrinsicState intrinsicState) {
		this.intrinsicState = intrinsicState;
	}
}
