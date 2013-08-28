package com.danandreicarp.learn.designpatterns.flyweight;

public class FlyweightA implements IFlyweight {

	IntrinsicState intrinsicState;

	public FlyweightA(final IntrinsicState intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void statefulOperation(final ExtrinsicState extrinsicState) {
		System.out.println("type one " + intrinsicState + " " + extrinsicState);
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
